package com.mindtree.bankdata.service.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.bankdata.dto.UserDto;
import com.mindtree.bankdata.entity.User;
import com.mindtree.bankdata.repository.UserRepository;
import com.mindtree.bankdata.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	private ModelMapper modelMapper = new ModelMapper();

	@Override
	public String addUserDetails(UserDto userDto) {
		User user = modelMapper.map(userDto, User.class);
		userRepository.save(user);
		return "User Data Inserted Successfully";
	}

	@Override
	public String deleteUserDetails(int userId) {
		// Optional<User> optionalUser = userRepository.findById(userId);
		userRepository.deleteById(userId);
		return "User Deleted.";

	}

	@Override
	public List<UserDto> getAllData() {
		List<User> users = userRepository.findAll();
		List<UserDto> userDtos = users.stream().map(i -> modelMapper.map(i, UserDto.class))
				.collect(Collectors.toList());
		return userDtos;
	}
}
