package com.handler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.driver_dao;

/**
 * Servlet implementation class deletedriver
 */
@WebServlet("/deletedriver")
public class deletedriver extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deletedriver() {
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
		int status=driver_dao.deletedriver(id);
		if(status>0)
		{
			pw.print("<Script>alert('Driver data delete Sucessfully')</Script>");
			RequestDispatcher rd=request.getRequestDispatcher("view_driver");
			rd.forward(request, response);
		}
		else 
		{
			pw.print("<Script>alert('Driver data Not delete Sucessfully')</Script>");
			RequestDispatcher rd=request.getRequestDispatcher("view_driver");
			rd.include(request,response);
		}
	}

}
