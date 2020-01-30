package com.mindtree.bankdata.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.bankdata.dto.UserDto;

@Service
public interface UserService {

	/**
	 * @param userDto
	 * @return
	 */
	String addUserDetails(UserDto userDto);

	/**
	 * @param userId
	 * @return
	 */
	String deleteUserDetails(int userId);

	/**
	 * @return
	 */
	List<UserDto> getAllData();

}
