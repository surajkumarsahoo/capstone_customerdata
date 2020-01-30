package com.mindtree.bankdata.exceptionhandler;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.mindtree.bankdata.controller.BankController;
import com.mindtree.bankdata.controller.UserController;
import com.mindtree.bankdata.exception.BankDataException;

@ControllerAdvice(assignableTypes = { BankController.class, UserController.class })
public class BankDataExceptionHandler {
	@ExceptionHandler(BankDataException.class)
	public String handleBankDataException(BankDataException bankDataException, Model model) {
		model.addAttribute("message", bankDataException.getMessage());
		return "error";

	}
}
