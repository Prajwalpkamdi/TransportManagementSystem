package com.bo;

public class contact_bo
{
	private String name,number,email;

	public String getName() {
		return name;
	}

	public String getNumber() {
		return number;
	}

	public String getEmail() {
		return email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "contact_bo [name=" + name + ", number=" + number + ", email=" + email + "]";
	}

	public contact_bo(String name, String number, String email) {
		super();
		this.name = name;
		this.number = number;
		this.email = email;
	}

	public contact_bo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
