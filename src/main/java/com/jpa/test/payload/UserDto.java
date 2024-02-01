package com.jpa.test.payload;

import java.util.Set;

import com.jpa.test.entity.Address;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
public class UserDto {

	
	private Integer id;

	
	private String firstname;
	
	private String lastname;
	//@Column(name="email")
	private String email;
	private String password;

	//@ElementCollection
	private Set<Address> address;
}
