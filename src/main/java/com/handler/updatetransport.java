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
 * Servlet implementation class updatetransport
 */
@WebServlet("/updatetransport")
public class updatetransport extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updatetransport() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
		
		transport tr=new transport(id,tname, ttype,vno, plocation, dlocation, dname,dnumber);
		int status=transport_dao.updatetransport(tr);
		
		if(status>0)
		{
			pw.print("<Script>alert('Your data is sucessfully updated')</script>");
			RequestDispatcher rd=request.getRequestDispatcher("view_transport");
			rd.forward(request, response);
			
		}
		else
		{
			pw.print("<Script>alert('Your data is  not sucessfully updated')</script>");
			RequestDispatcher rd=request.getRequestDispatcher("edittransport");
			rd.include(request, response);
		}
	}

}
