package com.jpa.test.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private Integer houseNumber;
	
	private String streetName;
	
	private Integer pincode;
	
	private String landmark;

}
