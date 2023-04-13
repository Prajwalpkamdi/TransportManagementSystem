package com.handler;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bo.driver;
import com.bo.transport;
import com.dao.driver_dao;
import com.dao.transport_dao;

/**
 * Servlet implementation class view_driver
 */
@WebServlet("/view_driver")
public class view_driver extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public view_driver() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		List<driver> li=driver_dao.viewdriver();
		pw.print("<link rel=\"stylesheet\" href=\"css/transport.css\">");
		 pw.print("<a href='home.html'>Back</a>");
		     pw.print("<div>");
		   pw.print("<table border='1px' width='100%'> ");
		    pw.print("<tr style='background: linear-gradient(90deg,rgb(147, 255, 120),rgb(255, 150, 150),rgb(255, 144, 84))'> <th> Id </th> <th> Driver Name </th> <th> Driver Type  </th> <th> Driver Mob_No </th> <th> Driver D-O-B </th> <th> Licence Number </th> <th> Aadhar Number </th> <th>PAN Number</th><th>Address</th><th>Update</th><th>Delete</th></tr>");
		   
		  for(driver eb:li) 
		  {
			  pw.print("<tr style='background: linear-gradient(90deg,rgb(209, 255, 197),rgb(229, 212, 212),rgb(255, 187, 150))'><td>"+eb.getId()+"</td><td>"+eb.getDriver_name()+"</td><td>"+eb.getDriver_type()+"</td><td>"+eb.getDriver_mob()+"</td><td>"+eb.getDriver_dob()+"</td><td>"+eb.getLicence_no()+"</td><td>"+eb.getAadhar_no()+"</td><td>"+eb.getPan_no()+"</td><td>"+eb.getAdress()+"</td><td>"+"<a href='editdriver?id="+eb.getId()+"'> Update </a> </td><td>"+"<a href='deletedriver?id="+eb.getId()+"'> Delete </a> </td></tr>"); 
		  }
		  pw.print("</table>");
		  pw.print("</div>");
		  pw.close();
	}

}
