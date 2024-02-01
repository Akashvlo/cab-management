package com.jpa.test.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.jpa.test.entity.User;
import com.jpa.test.exception.ResourceNotFoundException;
import com.jpa.test.payload.UserDto;
import com.jpa.test.repo.UserRepo;
import com.jpa.test.service.UserService;
import com.jpa.test.exception.*;
public class ServiceImpl implements UserService {
    
	@Autowired
	private UserRepo userRepo;
	
	@Override
	public UserDto createUser(UserDto userDto) {
		
		User user=this.dtoToUser(userDto);
		User savedUser=this.userRepo.save(user);
		return this.userToDto(savedUser);
		
		
	}

	@Override
	public UserDto UpdateUser(UserDto userDto, Integer userId) {
		
		User user=this.userRepo.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User","id",userId));
		
		
		return null;
	}

	@Override
	public UserDto getUserById(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDto> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Integer userId) {
		// TODO Auto-generated method stub

	}
	
	private 

}
