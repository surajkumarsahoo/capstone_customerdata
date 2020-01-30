package com.mindtree.bankdata.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.mindtree.bankdata.dto.BankDto;
import com.mindtree.bankdata.exception.serviceexception.BankDataServiceException;

@Service
public interface BankService {

	/**
	 * @param brandDto
	 * @return
	 * @throws BankDataServiceException
	 */
	String addBankDetails(BankDto bankDto) throws BankDataServiceException;

	/**
	 * @return
	 */
	List<BankDto> getAllData();

	/**
	 * @return
	 */
	Map<String, Integer> getDetils();

	/**
	 * @param bankId
	 * @param userId
	 * @return
	 */
	String linkBankWithUser(int bankId, int userId);

}
