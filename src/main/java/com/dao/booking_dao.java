package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bo.booking_bo;
import com.bo.contact_bo;

public class booking_dao 
{
	public static int addbooking(booking_bo bo)
	{
		Connection con=signup_dao.getconnection();
		int status=0;
		try
		{
			PreparedStatement ps=con.prepareStatement("insert into booking(Name,Mob_no,Pickup,Drop_loc,Materal, Weight,Truck_type,No_of_Truck,Schduled_date)values(?,?,?,?,?,?,?,?,?)");
			ps.setString(1,bo.getName());
			ps.setString(2,bo.getMob_no());
			ps.setString(3,bo.getPickup());
			ps.setString(4,bo.getDrop_loc());
			ps.setString(5,bo.getMateral());
			ps.setString(6,bo.getWeight());
			ps.setString(7,bo.getTruck_type());
			ps.setString(8,bo.getNo_of_Truck());
			ps.setString(9,bo.getSchduled_date());
			status=ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return status;
	}
}
