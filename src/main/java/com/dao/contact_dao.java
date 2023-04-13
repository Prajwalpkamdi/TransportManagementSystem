package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bo.contact_bo;

public class contact_dao 
{
	public static int addcontact(contact_bo bo)
	{
		Connection con=signup_dao.getconnection();
		int status=0;
		try
		{
			PreparedStatement ps=con.prepareStatement("insert into contact(name,number,email)values(?,?,?)");
			ps.setString(1,bo.getName());
			ps.setString(2,bo.getNumber());
			ps.setString(3,bo.getEmail());
			status=ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return status;
	}
}
