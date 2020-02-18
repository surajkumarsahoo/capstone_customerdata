package com.mindtree.bankdata.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mindtree.bankdata.dto.BankDto;
import com.mindtree.bankdata.dto.UserDto;
import com.mindtree.bankdata.exception.BankDataException;
import com.mindtree.bankdata.exception.serviceexception.BankDataServiceException;
import com.mindtree.bankdata.service.BankService;
import com.mindtree.bankdata.service.UserService;

@Controller
public class BankController {
	@Autowired
	private BankService bankService;
	@Autowired
	private UserService userService;

	@RequestMapping("/home")
	public String home() {
		return "index";
	}

	@RequestMapping("/addbank")
	public String index() {
		return "addBank";
	}

	@PostMapping("/addbankdata")
	public String addBankData(BankDto bankDto, Model model) throws BankDataException {
		String message = null;
		try {
			message = bankService.addBankDetails(bankDto);
		} catch (BankDataServiceException e) {
			throw new BankDataServiceException(e.getMessage(), e);
		}

		model.addAttribute("message", message);

		return "success";

	}

	@RequestMapping("/linkbankanduser")
	public String linkbankanduser(Model model) {
		List<UserDto> userDtos = userService.getAllData();
		List<BankDto> bankDtos = bankService.getAllData();

		model.addAttribute("users", userDtos);
		model.addAttribute("banks", bankDtos);

		return "linkBankWithUser";
	}

	@RequestMapping("/linkuserwithbank")
	public String linkuserwithbank(int bankId, int userId, Model model) {
		System.out.println(bankId + "" + userId);
		String message=bankService.linkBankWithUser(bankId,userId);
		model.addAttribute("message", message);
		return "success";
	}

	@RequestMapping("/viewdetails")
	public String viewdetails(Model model) {
		Map<String, Integer> bankDetails = bankService.getDetils();
		for (String name : bankDetails.keySet())
			System.out.println("key: " + name);
		for (Integer url : bankDetails.values())
			System.out.println("value: " + url);

		model.addAttribute("data", bankDetails);
		return "viewBankDetails";
	}
}
