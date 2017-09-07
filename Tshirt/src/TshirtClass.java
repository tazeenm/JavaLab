

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TshirtClass
 */
@WebServlet("/TshirtClass")
public class TshirtClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       int n =100;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TshirtClass() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  response.setContentType("text/html");
	        PrintWriter out=response.getWriter();
	        String[] Accessories={};
	        Accessories=request.getParameterValues("access");
	        String tshirtAccessories="";
	        String tshirtTagLine=request.getParameter("tagline");
	        String tshirtOption=request.getParameter("pocket");
	        String tcolor=request.getParameter("Tshirtcolor");
	        out.println("<html>");
	        out.println("<head><title>T-shirt</title></head>");
	        out.println("<body>");
	        try {
	                   Statement stmt;
	                   Class.forName("com.mysql.jdbc.Driver");
	                   Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tshirt1", "tazeen", "kitkat");
	                 
	                   if (conn != null) {
	                       stmt= conn.createStatement();
	                       String qu;
	                      
	                       if(tshirtAccessories!=null && tshirtTagLine!=null && tshirtOption!=null && tcolor!=null){
	                       for(String option:Accessories){
	                       tshirtAccessories=tshirtAccessories+option;
	                       }
	                       n=n+1;
	                        
	                       qu="insert into tshirt values('"+n+"','"+tshirtTagLine+"','"+tshirtAccessories+"','"+tcolor+"','"+tshirtOption+"');";
	                      
	                       stmt.executeUpdate(qu);
	                       }
	                       qu="select * from tshirt;";
	                       ResultSet rs =stmt.executeQuery(qu);
	                       out.println("<table border=2>");
	                   out.println("<tr>");
	                   out.print("<td>OrderNo</td>");
	                   out.print("<td>T-shirt Accessories</td>");
	                   out.print("<td>T-shirt tag-line</td>");
	                   out.print("<td>T-shirt type</td>");
	                   out.print("<td>T-shirt color</td>");
	                   out.println("</tr>");
	                   if(!rs.isBeforeFirst()){
	                   out.print("<tr>");
	        out.print("<td>100</td>");
	        out.print("<td>NULL</td>");
	        out.print("<td>NULL</td>");
	        out.print("<td>NULL</td>");
	        out.print("<td>NULL</td>");
	        out.print("<td>NULL</td>");
	        out.println("</tr>");
	                   }
	                  
	                   while(rs.next()){
	                   //int v=0;
	                   out.println("<tr>");
	                   int  v=rs.getInt("id");
	                   //v=v+1;
	                       out.print("<td>"+v+"</td>");
	                       out.print("<td>"+rs.getString("tag_line")+"</td>");
	                       out.print("<td>"+rs.getString("access")+"</td>");
	                       out.print("<td>"+rs.getString("color")+"</td>");
	                       out.print("<td>"+rs.getString("pocket")+"</td>");
	                       out.println("</tr>");
	                   }
	                   out.println("</table>");
	                   out.println("<a href=\"TFile.jsp\">click here</a>");
	                   out.println("</body></html>");
	                   }
	        }
	        catch (Exception e){
	        e.printStackTrace();
	        }
	            }
	}



