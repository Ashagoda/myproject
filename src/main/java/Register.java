

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
                   String name=request.getParameter("name");
                   System.out.println("name");
                   String email=request.getParameter("email");
                   System.out.println("email");
                   String username=request.getParameter("username");
                   System.out.println("username");
                   String password=request.getParameter("password");
                   System.out.println("password");
                   String mobile=request.getParameter("mobile");
                   System.out.println("confirm password");
		try {
			
			Class.forName("org.h2.Driver");
		    System.out.println("driver is ok");
		
		//jdbc:h2:~/dt9
       //jdbc:h2:tcp://localhost/~/dt9
		    
	Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/dt9","har","har");
	System.out.println("connection is ok");
	
	Statement stmt=conn.createStatement();
	
	/* PreparedStatement ps=conn.prepareStatement("insert into register values(?,?,?,?,?)");
	ps.setString(1, name);
	ps.setString(2,email);
	ps.setString(3, username);
	ps.setString(4, password);
	ps.setString(5, mobile);
	ps.executeUpdate();*/
	
	System.out.println("statement is ok");

	stmt.executeUpdate("insert into register values('"+name+"','"+email+"','"+username+"','"+password+"','"+mobile+"')");
	//stmt.executeUpdate("create table register(name varchar(20),marks int)");
	System.out.println("query executed succesfully");
	conn.close();
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PrintWriter pw=response.getWriter();
		
		pw.print("register successfull");
}
	
}