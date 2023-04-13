package com.handler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bo.contact_bo;
import com.bo.transport;
import com.dao.contact_dao;
import com.dao.transport_dao;

/**
 * Servlet implementation class add_contact
 */
@WebServlet("/add_contact")
public class add_contact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public add_contact() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String name=request.getParameter("name");
		String number=request.getParameter("number");
		String email=request.getParameter("email");
		
		
		contact_bo ob=new contact_bo(name, number, email); 
		
		int status=contact_dao.addcontact(ob);
		if(status>0)
		{
			pw.print("<script>alert('Contact data Enter Sucessfully')</script>");
			 RequestDispatcher rd=request.getRequestDispatcher("home.html");
	    	 rd.include(request, response);
		}
		else
		{
			pw.print("<script>alert('Contact data Not Enter Sucessfully')</script>");
			RequestDispatcher rd=request.getRequestDispatcher("home.html");
	    	 rd.include(request, response);
		}
	}

}
