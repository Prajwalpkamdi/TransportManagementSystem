package com.bo;

public class transport 
{
	private int id;
	private String	Transport_Name,Transport_Type,Vehicle_Number,Pickup_Location,Drop_Location,Driver_Name,Driver_Mob_No;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTransport_Name() {
		return Transport_Name;
	}

	public String getTransport_Type() {
		return Transport_Type;
	}

	public String getVehicle_Number() {
		return Vehicle_Number;
	}

	public String getPickup_Location() {
		return Pickup_Location;
	}

	public String getDrop_Location() {
		return Drop_Location;
	}

	public String getDriver_Name() {
		return Driver_Name;
	}

	public String getDriver_Mob_No() {
		return Driver_Mob_No;
	}

	public void setTransport_Name(String transport_Name) {
		Transport_Name = transport_Name;
	}

	public void setTransport_Type(String transport_Type) {
		Transport_Type = transport_Type;
	}

	public void setVehicle_Number(String vehicle_Number) {
		Vehicle_Number = vehicle_Number;
	}

	public void setPickup_Location(String pickup_Location) {
		Pickup_Location = pickup_Location;
	}

	public void setDrop_Location(String drop_Location) {
		Drop_Location = drop_Location;
	}

	public void setDriver_Name(String driver_Name) {
		Driver_Name = driver_Name;
	}

	public void setDriver_Mob_No(String driver_Mob_No) {
		Driver_Mob_No = driver_Mob_No;
	}

	@Override
	public String toString() {
		return "transport [Transport_Name=" + Transport_Name + ", Transport_Type=" + Transport_Type
				+ ", Vehicle_Number=" + Vehicle_Number + ", Pickup_Location=" + Pickup_Location + ", Drop_Location="
				+ Drop_Location + ", Driver_Name=" + Driver_Name + ", Driver_Mob_No=" + Driver_Mob_No + "]";
	}

	public transport(int id,String transport_Name, String transport_Type, String vehicle_Number, String pickup_Location,
			String drop_Location, String driver_Name, String driver_Mob_No) {
		super();
		this.id=id;
		Transport_Name = transport_Name;
		Transport_Type = transport_Type;
		Vehicle_Number = vehicle_Number;
		Pickup_Location = pickup_Location;
		Drop_Location = drop_Location;
		Driver_Name = driver_Name;
		Driver_Mob_No = driver_Mob_No;
	}

	public transport() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
