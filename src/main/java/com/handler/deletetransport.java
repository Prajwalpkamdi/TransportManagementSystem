package com.handler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.transport_dao;

/**
 * Servlet implementation class deletetransport
 */
@WebServlet("/deletetransport")
public class deletetransport extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deletetransport() {
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
		
		int status=transport_dao.deletetransport(id);
		if(status>0)
		{
			pw.print("<script>alert('Transport details delete Sucessfully')</script>");
			RequestDispatcher rd=request.getRequestDispatcher("view_transport");
			rd.forward(request, response);
		}
		else
		{
			pw.print("<script>alert('Transport details not delete Sucessfully...!')</script>");
			RequestDispatcher rd=request.getRequestDispatcher("view_transport");
			rd.forward(request, response);
		}
			
	}

}
