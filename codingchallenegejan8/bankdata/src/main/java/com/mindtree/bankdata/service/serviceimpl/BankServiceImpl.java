package com.mindtree.bankdata.service.serviceimpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.bankdata.dto.BankDto;
import com.mindtree.bankdata.entity.Bank;
import com.mindtree.bankdata.entity.User;
import com.mindtree.bankdata.exception.ErrorConstant;
import com.mindtree.bankdata.exception.serviceexception.BankDataServiceException;
import com.mindtree.bankdata.exception.serviceexception.BankNameAvailableException;
import com.mindtree.bankdata.repository.BankRepository;
import com.mindtree.bankdata.repository.UserRepository;
import com.mindtree.bankdata.service.BankService;

@Service
public class BankServiceImpl implements BankService {

	@Autowired
	private BankRepository bankRepository;
	@Autowired
	private UserRepository userRepository;
	private ModelMapper modelMapper = new ModelMapper();

	@Override
	public String addBankDetails(BankDto bankDto) throws BankDataServiceException {
		Bank bank = modelMapper.map(bankDto, Bank.class);
		try {
			if (bankRepository.findBybankName(bank.getBankName()).isPresent()) {
				throw new BankNameAvailableException(ErrorConstant.BankNameAvailableException);

			} else {
				bankRepository.save(bank);
				return "brand name inserted.";
			}
		} catch (BankNameAvailableException bankNameAvailableException) {
			throw new BankDataServiceException(bankNameAvailableException.getMessage(), bankNameAvailableException);
		}
	}

	@Override
	public List<BankDto> getAllData() {

		List<Bank> banks = bankRepository.findAll();
		List<BankDto> bankDtos = banks.stream().map(i -> modelMapper.map(i, BankDto.class))
				.collect(Collectors.toList());
		return bankDtos;
	}

	@Override
	public Map<String, Integer> getDetils() {

		List<Bank> bankDatas = bankRepository.findAll();
		Map<String, Integer> bankBalance = new HashMap<String, Integer>();
		for (Bank bank : bankDatas) {
			int balance = 0;
			for (User user : bank.getUsers()) {
				balance += user.getOpeningBalance();
			}
			bankBalance.put(bank.getBankName(), balance);
		}
		return bankBalance;
	}

	@Override
	public String linkBankWithUser(int bankId, int userId) {
		Bank bank = bankRepository.findById(bankId).get();
		User user = userRepository.findById(userId).get();
		Set<User> users = bank.getUsers();
		Set<Bank> banks = user.getBanks();
		users.add(user);
		//banks.add(bank);
		bank.setUsers(users);
		//user.setBanks(banks);
		bankRepository.saveAndFlush(bank);
		//userRepository.saveAndFlush(user);
		return "link success";
	}

}
