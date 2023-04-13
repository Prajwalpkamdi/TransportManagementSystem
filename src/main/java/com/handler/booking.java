package com.handler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bo.booking_bo;
import com.dao.booking_dao;

/**
 * Servlet implementation class booking
 */
@WebServlet("/booking")
public class booking extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public booking() {
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
		String piloc=request.getParameter("piloc");
		String materal=request.getParameter("materal");
		String type=request.getParameter("type");
		String sd=request.getParameter("sd");
		String number=request.getParameter("number");
		String droploc=request.getParameter("droploc");
		String weight=request.getParameter("weight");
		String no=request.getParameter("no");
		booking_bo bo=new booking_bo(name, number,piloc, droploc, materal, weight, type, no, sd);
		int status=booking_dao.addbooking(bo);
		if(status>0)
		{
			pw.print("<script>alert('Booking Sucessfully')</script>");
			 RequestDispatcher rd=request.getRequestDispatcher("home.html");
	    	 rd.include(request, response);
		}
		else
		{
			pw.print("<script>alert('Booking Not Sucessful...!')</script>");
			RequestDispatcher rd=request.getRequestDispatcher("home.html");
	    	 rd.include(request, response);
		}
	}

}
