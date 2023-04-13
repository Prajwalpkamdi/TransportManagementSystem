package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bo.signup_bo;

public class signup_dao 
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
	public static int singup(signup_bo bo)
	{
		Connection con=signup_dao.getconnection();
		int status=0;
		try
		{
			PreparedStatement ps=con.prepareStatement("insert into signup(Name,Email,Mob,pass,con_pass)values(?,?,?,?,?)");
			ps.setString(1,bo.getName());
			ps.setString(2,bo.getEmail());
			ps.setString(3,bo.getMob());
			ps.setString(4,bo.getPass());
			ps.setString(5,bo.getCpass());
			status=ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return status;
	}
	public static boolean login(String email,String pass)
	{
		Connection con=signup_dao.getconnection();
		boolean status=false;
		try
		{
			PreparedStatement ps=con.prepareStatement("select * from signup where email=? and pass=?");
			ps.setString(1,email);
			ps.setString(2,pass);
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return status;
	}
}
