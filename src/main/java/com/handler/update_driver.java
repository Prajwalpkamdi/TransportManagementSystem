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
 * Servlet implementation class update_driver
 */
@WebServlet("/update_driver")
public class update_driver extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public update_driver() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
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
		
		driver dr=new driver(id, dname, dtype, dnumber, dob, lnumber, anumber, pnumber, addres); 
		int status=driver_dao.updatedriver(dr);
		if(status>0)
		{
			pw.print("<script>alert('Driver data is Suessfully Updated')</script>");
			RequestDispatcher rd=request.getRequestDispatcher("view_driver");
			rd.forward(request, response);
		}
		else
		{
			pw.print("<script>alert('Driver data is Suessfully Updated')</script>");
			RequestDispatcher rd=request.getRequestDispatcher("editdriver");
			rd.include(request, response);
		}
	}

}
