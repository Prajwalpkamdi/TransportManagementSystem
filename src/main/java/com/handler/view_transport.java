package com.handler;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bo.transport;
import com.dao.transport_dao;



/**
 * Servlet implementation class view_transport
 */
@WebServlet("/view_transport")
public class view_transport extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public view_transport() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		List<transport> li=transport_dao.viewtran();
		pw.print("<link rel=\"stylesheet\" href=\"css/transport.css\">");
		 pw.print("<a href='home.html'>Back</a>");
		     pw.print("<div>");
		   pw.print("<table border='1px' width='100%'> ");
		    pw.print("<tr style='background: linear-gradient(90deg,rgb(147, 255, 120),rgb(255, 150, 150),rgb(255, 144, 84))'> <th> Id </th> <th> Transport Name </th> <th> Transport Type </th> <th> Vehicle Number </th> <th> Pickup Location </th> <th> Drop Location </th> <th> Driver Name </th> <th>Driver Mob_No</th><th>Update</th><th>Delete</th></tr>");
		   
		  for(transport eb:li) 
		  {
			  pw.print("<tr style='background: linear-gradient(90deg,rgb(209, 255, 197),rgb(229, 212, 212),rgb(255, 187, 150))'><td>"+eb.getId()+"</td><td>"+eb.getTransport_Name()+"</td><td>"+eb.getTransport_Type()+"</td><td>"+eb.getVehicle_Number()+"</td><td>"+eb.getPickup_Location()+"</td><td>"+eb.getDrop_Location()+"</td><td>"+eb.getDriver_Name()+"</td><td>"+eb.getDriver_Mob_No()+"</td><td>"+"<a href='edittransport?id="+eb.getId()+"'> Update </a> </td><td>"+"<a href='deletetransport?id="+eb.getId()+"'> Delete </a> </td></tr>"); 
		  }
		  pw.print("</table>");
		  pw.print("</div>");
		  pw.close();
		
		
	}

}
