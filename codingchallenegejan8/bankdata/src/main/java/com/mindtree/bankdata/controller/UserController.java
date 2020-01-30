package com.mindtree.bankdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mindtree.bankdata.dto.UserDto;
import com.mindtree.bankdata.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/adduser")
	public String index() {
		return "addUser";
	}

	@PostMapping("/adduserdata")
	public String addUserData(UserDto userDto, Model model) {
		String message = null;

		message = userService.addUserDetails(userDto);

		model.addAttribute("message", message);

		return "success";

	}

	@RequestMapping("/deleteuser")
	public String redirectToDeletePage() {
		return "deleteUser";
	}

	@PostMapping("/deleteuserdata")
	public String deleteUserData(int userId, Model model) {
		String message = null;

		message = userService.deleteUserDetails(userId);

		model.addAttribute("message", message);

		return "success";

	}
}
