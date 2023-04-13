package com.handler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bo.transport;
import com.dao.transport_dao;

/**
 * Servlet implementation class add_transport
 */
@WebServlet("/add_transport")
public class add_transport extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public add_transport() {
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
		String tname=request.getParameter("tname");
		String ttype=request.getParameter("ttype");
		String vno=request.getParameter("vno");
		String plocation=request.getParameter("plocation");
		String dlocation=request.getParameter("dlocation");
		String dname=request.getParameter("dname");
		String dnumber=request.getParameter("dnumber");
		
		transport ob=new transport(id,tname, ttype, vno, plocation, dlocation, dname, dnumber);
		
		int status=transport_dao.addtransport(ob);
		if(status>0)
		{
			pw.print("<script>alert('Driver data Enter Sucessfully')</script>");
//			RequestDispatcher rd=request.getRequestDispatcher("view_transport");
//			rd.forward(request, response);
		}
		else
		{
			pw.print("<script>alert('Driver data Not Enter Sucessfully')</script>");
//			RequestDispatcher rd=request.getRequestDispatcher("add_transport.html");
//			rd.include(request, response);
		}
		
		
	}

}
