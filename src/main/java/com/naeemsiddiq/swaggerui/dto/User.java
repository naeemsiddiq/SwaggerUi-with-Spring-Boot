package com.naeemsiddiq.swaggerui.dto;

public class User {

	Long id;
	String name;
	String email;
	String address;
	String contactNum;

	public User(Long id, String name, String email, String address, String contactNum) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.contactNum = contactNum;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactNum() {
		return contactNum;
	}

	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}
}
