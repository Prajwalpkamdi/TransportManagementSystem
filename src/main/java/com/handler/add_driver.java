package com.handler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bo.driver;
import com.dao.driver_dao;

/**
 * Servlet implementation class add_driver
 */
@WebServlet("/add_driver")
public class add_driver extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public add_driver() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		int id=Integer.parseInt(request.getParameter("id"));
		String dname=request.getParameter("dname");
		String dtype=request.getParameter("dtype");
		String dnumber=request.getParameter("dnumber");
		String dob=request.getParameter("dob");
		String lnumber=request.getParameter("lnumber");
		String anumber=request.getParameter("anumber");
		String pnumber=request.getParameter("pnumber");
		String addres=request.getParameter("addres");
		
		driver ob=new driver(id,dname, dtype, dnumber, dob, lnumber, anumber, pnumber, addres);
		int status=driver_dao.adddriver(ob);
		if(status>0)
		{
			pw.print("<script>alert('Driver data Enter Sucessfully')</script>");
//			RequestDispatcher rd=request.getRequestDispatcher("view_driver");
//			rd.forward(request, response);
		}
		else
		{
			pw.print("<script>alert('Driver data Not Enter Sucessfully')</script>");
//			RequestDispatcher rd=request.getRequestDispatcher("add_driver.html");
//			rd.include(request, response);
		}
		
	}

}
