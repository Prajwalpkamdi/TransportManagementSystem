package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bo.driver;
import com.bo.transport;


public class driver_dao 
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
	public static int adddriver(driver bo)
	{
		Connection con=driver_dao.getconnection();
		int status=0;
		try
		{
			PreparedStatement ps=con.prepareStatement("insert into driver(Driver_name,Driver_type,Driver_mob,Driver_dob,licence_no,aadhar_no,Pan_no,adress)values(?,?,?,?,?,?,?,?)");
			ps.setString(1,bo.getDriver_name());
			ps.setString(2,bo.getDriver_type());
			ps.setString(3,bo.getDriver_mob());
			ps.setString(4,bo.getDriver_dob());
			ps.setString(5,bo.getLicence_no());
			ps.setString(6,bo.getAadhar_no());
			ps.setString(7,bo.getPan_no());
			ps.setString(8,bo.getAdress());
			status=ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return status;
	}
	public static List viewdriver()
	{
		List<driver> list=new ArrayList<driver>();
		try
		{
			Connection cn=transport_dao.getconnection();
			PreparedStatement ps=cn.prepareStatement("select * from driver");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				driver ob=new driver();
				ob.setId(rs.getInt(1));
				ob.setDriver_name(rs.getString(2));
				ob.setDriver_type(rs.getString(3));
				ob.setDriver_mob(rs.getString(4));
				ob.setDriver_dob(rs.getString(5));
				ob.setLicence_no(rs.getString(6));
				ob.setAadhar_no(rs.getString(7));
				ob.setPan_no(rs.getString(8));
				ob.setAdress(rs.getString(9));
				list.add(ob);
			}
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		return list;
		
	}
	public static driver editdriver(int id)
	{
		driver dr=new driver();
		try 
		{
			Connection con=transport_dao.getconnection();
			PreparedStatement ps=con.prepareStatement("select * from driver where id=?");
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				dr.setId(rs.getInt(1));
				dr.setDriver_name(rs.getString(2));
				dr.setDriver_type(rs.getString(3));
				dr.setDriver_mob(rs.getString(4));
				dr.setDriver_dob(rs.getString(5));
				dr.setLicence_no(rs.getString(6));
				dr.setAadhar_no(rs.getString(7));
				dr.setPan_no(rs.getString(8));
				dr.setAdress(rs.getString(9));
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		return dr;
	}
	public static int updatedriver(driver bo)
	{
		Connection con=driver_dao.getconnection();
		int status=0;
		try
		{
			PreparedStatement ps=con.prepareStatement("update driver set Driver_name=?,Driver_type=?,Driver_mob=?,Driver_dob=?,licence_no=?,aadhar_no=?,Pan_no=?,adress=? where id=?");
			ps.setString(1,bo.getDriver_name());
			ps.setString(2,bo.getDriver_type());
			ps.setString(3,bo.getDriver_mob());
			ps.setString(4,bo.getDriver_dob());
			ps.setString(5,bo.getLicence_no());
			ps.setString(6,bo.getAadhar_no());
			ps.setString(7,bo.getPan_no());
			ps.setString(8,bo.getAdress());
			ps.setInt(9,bo.getId());
			status=ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return status;
	}
	public static int deletedriver(int id)
	{
		Connection con=driver_dao.getconnection();
		int status=0;
		try
		{
			PreparedStatement ps=con.prepareStatement("delete from driver where id=?");
			ps.setInt(1,id);
			status=ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return status;
	}
}