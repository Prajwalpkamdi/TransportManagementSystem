package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bo.signup_bo;
import com.bo.transport;

public class transport_dao 
{
	public static Connection getconnection()
	{
		Connection con=null;
		try
		{
			String url="jdbc:mysql://localhost:3306/transport";
			String un="root";
			String pss="Prajwal@123";
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,un,pss);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
	}
	public static int addtransport(transport bo)
	{
		Connection con=signup_dao.getconnection();
		int status=0;
		try
		{
			PreparedStatement ps=con.prepareStatement("insert into transport(Transport_Name,Transport_Type,Vehicle_Number,Pickup_Location,Drop_Location,Driver_Name,Driver_Mob_No)values(?,?,?,?,?,?,?)");
			ps.setString(1,bo.getTransport_Name());
			ps.setString(2,bo.getTransport_Type());
			ps.setString(3,bo.getVehicle_Number());
			ps.setString(4,bo.getPickup_Location());
			ps.setString(5,bo.getDrop_Location());
			ps.setString(6,bo.getDriver_Name());
			ps.setString(7,bo.getDriver_Mob_No());
			status=ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return status;
	}
	
	public static List viewtran()
	{
		List<transport> list=new ArrayList<transport>();
		try
		{
			Connection cn=transport_dao.getconnection();
			PreparedStatement ps=cn.prepareStatement("select * from transport");
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				transport ob=new transport();
				ob.setId(rs.getInt(1));
				ob.setTransport_Name(rs.getString(2));
				ob.setTransport_Type(rs.getString(3));
				ob.setVehicle_Number(rs.getString(4));
				ob.setPickup_Location(rs.getString(5));
				ob.setDrop_Location(rs.getString(6));
				ob.setDriver_Name(rs.getString(7));
				ob.setDriver_Mob_No(rs.getString(8));
				list.add(ob);
			}
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		return list;
		
	}
	public static transport edittransport(int id)
	{
		transport tr=new transport();
		try 
		{
			Connection con=transport_dao.getconnection();
			PreparedStatement ps=con.prepareStatement("select * from transport where id=?");
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				tr=new transport();
				tr.setId(rs.getInt(1));
				tr.setTransport_Name(rs.getString(2));
				tr.setTransport_Type(rs.getString(3));
				tr.setVehicle_Number(rs.getString(4));
				tr.setPickup_Location(rs.getString(5));
				tr.setDrop_Location(rs.getString(6));
				tr.setDriver_Name(rs.getString(7));
				tr.setDriver_Mob_No(rs.getString(8));
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		return tr;
	}
	public static int updatetransport(transport bo)
	{
		Connection con=signup_dao.getconnection();
		int status=0;
		try
		{
			PreparedStatement ps=con.prepareStatement("update transport set Transport_Name=? ,Transport_Type=?,Vehicle_Number=?,Pickup_Location=?,Drop_Location=?,Driver_Name=?,Driver_Mob_No=? where id=?");
			ps.setString(1,bo.getTransport_Name());
			ps.setString(2,bo.getTransport_Type());
			ps.setString(3,bo.getVehicle_Number());
			ps.setString(4,bo.getPickup_Location());
			ps.setString(5,bo.getDrop_Location());
			ps.setString(6,bo.getDriver_Name());
			ps.setString(7,bo.getDriver_Mob_No());
			ps.setInt(8,bo.getId());
			status=ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return status;
	}
	public static int deletetransport(int id)
	{
		int status=0;
		Connection con =transport_dao.getconnection();
		try 
		{
			PreparedStatement ps=con.prepareStatement("delete from transport where id=?");
			ps.setInt(1,id);
			status=ps.executeUpdate();
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		return status;
	}
}
