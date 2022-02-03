package com.ha.base;

public class Person {

	private String name;
	private Long phoneNumber;
	private String mailId;
	private String address;
	private static String schoolName;
	private static String schoolAddress;
	
//	Person (String name, String mailId, String address) {
//		this.name = name;
//		this.mailId = mailId;
//		this.address = address;
//	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		if(String.valueOf(phoneNumber).length()==10) {
			this.phoneNumber = phoneNumber;
		}else {
			System.out.println("InvalidNumber!!");
		}

	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	
	
}
