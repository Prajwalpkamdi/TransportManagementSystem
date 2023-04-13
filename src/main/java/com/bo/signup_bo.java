package com.bo;

public class signup_bo 
{
	private String name,email,mob,pass,cpass;

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getMob() {
		return mob;
	}

	public String getPass() {
		return pass;
	}

	public String getCpass() {
		return cpass;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public void setCpass(String cpass) {
		this.cpass = cpass;
	}

	@Override
	public String toString() {
		return "signup_bo [name=" + name + ", email=" + email + ", mob=" + mob + ", pass=" + pass + ", cpass=" + cpass
				+ "]";
	}

	public signup_bo(String name, String email, String mob, String pass, String cpass) {
		super();
		this.name = name;
		this.email = email;
		this.mob = mob;
		this.pass = pass;
		this.cpass = cpass;
	}

	public signup_bo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
