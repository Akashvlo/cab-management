package com.jpa.test.service;

import java.util.List;

import com.jpa.test.payload.UserDto;

public interface UserService {
	
	UserDto createUser(UserDto user);
	
	UserDto UpdateUser(UserDto user,Integer userId);
	
	UserDto getUserById(Integer userId);
	
	List<UserDto> getAllUsers();
	
	void deleteUser(Integer userId);

}
