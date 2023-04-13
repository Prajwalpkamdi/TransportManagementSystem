package com.handler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bo.transport;
import com.dao.transport_dao;

/**
 * Servlet implementation class edittransport
 */
@WebServlet("/edittransport")
public class edittransport extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public edittransport() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.print("<link rel=\"stylesheet\" href=\"css/table.css\">");
		String id=request.getParameter("id");
		  int t_id= Integer.parseInt(request.getParameter("id"));
		 transport eb=transport_dao.edittransport(t_id);
		 pw.print("<center>");
	pw.print("<form  action='updatetransport' method='get'> ");
	    
	pw.print("<div class=ab>");
	pw.print("<h1>Update Transport Details</h1>");
		pw.print("<table>");
		
		pw.print("<tr><td></td><td><input type='hidden' name='id' value='"+eb.getId()+"'/></td></tr>");  
		pw.print("<tr><td>Transport Name  </td> <td><input type='text' name='tname' id=te value='"+eb.getTransport_Name()+"'/></td></tr>");
	   	pw.print("<tr><td>Transport Type  </td> <td><input type='text' name='ttype' id=te value='"+eb.getTransport_Type()+"'/></td></tr>");
	   	pw.print("<tr><td>Vehicle Number </td> <td><input type='text' name='vno' id=te value='"+eb.getVehicle_Number()+"'/></td></tr>");
	   	pw.print("<tr><td>Pickup Location  </td> <td><input type='text' name='plocation' id=te value='"+eb.getPickup_Location()+"'/></td></tr>");
	   	pw.print("<tr><td>Drop Location  </td> <td><input type='text' name='dlocation' id=te value='"+eb.getDrop_Location()+"'/></td></tr>");
	   	pw.print("<tr><td>Driver Name  </td> <td><input type='text' name='dname' id=te value='"+eb.getDriver_Name()+"'/></td></tr>");
	   	pw.print("<tr><td>Driver Mob_No  </td> <td><input type='text' name='dnumber' id=te value='"+eb.getDriver_Mob_No()+"'/></td></tr>");
		
	    pw.print("<tr><td><input type='submit' value='Update' class='but'/></td><td><input type='reset' value='Reset' class='but'/></td></tr>"); 
	    
	   	pw.print("</table>");
		
		pw.print("</form>");
		pw.print("</div>");
		pw.print("</center>");
	}

}
