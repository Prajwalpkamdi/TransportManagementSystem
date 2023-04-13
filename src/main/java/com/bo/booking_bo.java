package com.bo;

public class booking_bo
{
	private String Name,Mob_no,Pickup,Drop_loc,Materal, Weight,Truck_type,No_of_Truck,Schduled_date;

	public String getName() {
		return Name;
	}

	public String getMob_no() {
		return Mob_no;
	}

	public String getPickup() {
		return Pickup;
	}

	public String getDrop_loc() {
		return Drop_loc;
	}

	public String getMateral() {
		return Materal;
	}

	public String getWeight() {
		return Weight;
	}

	public String getTruck_type() {
		return Truck_type;
	}

	public String getNo_of_Truck() {
		return No_of_Truck;
	}

	public String getSchduled_date() {
		return Schduled_date;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setMob_no(String mob_no) {
		Mob_no = mob_no;
	}

	public void setPickup(String pickup) {
		Pickup = pickup;
	}

	public void setDrop_loc(String drop_loc) {
		Drop_loc = drop_loc;
	}

	public void setMateral(String materal) {
		Materal = materal;
	}

	public void setWeight(String weight) {
		Weight = weight;
	}

	public void setTruck_type(String truck_type) {
		Truck_type = truck_type;
	}

	public void setNo_of_Truck(String no_of_Truck) {
		No_of_Truck = no_of_Truck;
	}

	public void setSchduled_date(String schduled_date) {
		Schduled_date = schduled_date;
	}

	public booking_bo(String name, String mob_no, String pickup, String drop_loc, String materal, String weight,
			String truck_type, String no_of_Truck, String schduled_date) {
		super();
		Name = name;
		Mob_no = mob_no;
		Pickup = pickup;
		Drop_loc = drop_loc;
		Materal = materal;
		Weight = weight;
		Truck_type = truck_type;
		No_of_Truck = no_of_Truck;
		Schduled_date = schduled_date;
	}

	public booking_bo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
