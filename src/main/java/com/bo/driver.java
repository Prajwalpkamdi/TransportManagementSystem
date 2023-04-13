package com.bo;

public class driver 
{
	private int id;
	private String Driver_name,Driver_type,Driver_mob,Driver_dob,licence_no,aadhar_no,Pan_no,adress;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDriver_name() {
		return Driver_name;
	}

	public String getDriver_type() {
		return Driver_type;
	}

	public String getDriver_mob() {
		return Driver_mob;
	}

	public String getDriver_dob() {
		return Driver_dob;
	}

	public String getLicence_no() {
		return licence_no;
	}

	public String getAadhar_no() {
		return aadhar_no;
	}

	public String getPan_no() {
		return Pan_no;
	}

	public String getAdress() {
		return adress;
	}

	public void setDriver_name(String driver_name) {
		Driver_name = driver_name;
	}

	public void setDriver_type(String driver_type) {
		Driver_type = driver_type;
	}

	public void setDriver_mob(String driver_mob) {
		Driver_mob = driver_mob;
	}

	public void setDriver_dob(String driver_dob) {
		Driver_dob = driver_dob;
	}

	public void setLicence_no(String licence_no) {
		this.licence_no = licence_no;
	}

	public void setAadhar_no(String aadhar_no) {
		this.aadhar_no = aadhar_no;
	}

	public void setPan_no(String pan_no) {
		Pan_no = pan_no;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "driver [Driver_name=" + Driver_name + ", Driver_type=" + Driver_type + ", Driver_mob=" + Driver_mob
				+ ", Driver_dob=" + Driver_dob + ", licence_no=" + licence_no + ", aadhar_no=" + aadhar_no + ", Pan_no="
				+ Pan_no + ", adress=" + adress + "]";
	}

	public driver(int id,String driver_name, String driver_type, String driver_mob, String driver_dob, String licence_no,
			String aadhar_no, String pan_no, String adress) {
		super();
		this.id=id;
		Driver_name = driver_name;
		Driver_type = driver_type;
		Driver_mob = driver_mob;
		Driver_dob = driver_dob;
		this.licence_no = licence_no;
		this.aadhar_no = aadhar_no;
		Pan_no = pan_no;
		this.adress = adress;
	}

	public driver() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
