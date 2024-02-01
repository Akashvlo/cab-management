package com.jpa.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.test.entity.User;

public interface UserRepo extends JpaRepository<User,Integer>
{
	
	

}
