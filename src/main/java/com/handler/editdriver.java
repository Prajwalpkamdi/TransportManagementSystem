package com.handler;

import java.io.IOException;
import java.io.PrintWriter;

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
 * Servlet implementation class editdriver
 */
@WebServlet("/editdriver")
public class editdriver extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editdriver() {
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
		  int d_id= Integer.parseInt(request.getParameter("id"));
		 driver eb=driver_dao.editdriver(d_id);
		 pw.print("<center>");
	pw.print("<form  action='update_driver' method='get'> ");
		
		pw.print("<div class=ab>");
		pw.print("<h1>Update Driver Details</h1>");
		pw.print("<table>");
		pw.print("<tr><td> </td><td><input type='hidden' name='id' value='"+eb.getId()+"'/></td></tr>");  
		pw.print("<tr><td>Driver Name  </td> <td><input type='text' id=te name='dname' value='"+eb.getDriver_name()+"'/></td></tr>");
	   	pw.print("<tr><td>Driver Type  </td> <td><input type='text' id=te name='dtype' value='"+eb.getDriver_type()+"'/></td></tr>");
	   	pw.print("<tr><td>Driver Mob_No </td> <td><input type='text' id=te name='dnumber' value='"+eb.getDriver_mob()+"'/></td></tr>");
	   	pw.print("<tr><td>Driver D-O-B  </td> <td><input type='text' id=te name='dob' value='"+eb.getDriver_dob()+"'/></td></tr>");
	   	pw.print("<tr><td>Licence Number  </td> <td><input type='text' id=te name='lnumber' value='"+eb.getLicence_no()+"'/></td></tr>");
	   	pw.print("<tr><td>Aadhar Numbe  </td> <td><input type='text' id=te name='anumber' value='"+eb.getAadhar_no()+"'/></td></tr>");
	   	pw.print("<tr><td>PAN Number   </td> <td><input type='text' id=te name='pnumber' value='"+eb.getPan_no()+"'/></td></tr>");
	   	pw.print("<tr><td>Address  </td> <td><input type='text' name='addres' id=te value='"+eb.getAdress()+"'/></td></tr>");
		
	    pw.print("<tr><td><input type='submit' value='Update' class='but'/></td><td><input type='reset' value='Reset' class='but' /></td></tr>"); 
	    
	   	pw.print("</table>");
		
		pw.print("</form>");
		pw.print("<div>");
		pw.print("</center>");
	}

}
