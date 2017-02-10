

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
	try
	{
		Class.forName("org.h2.Driver");
		System.out.println("Driver ok");
		
		Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/dt9","har","har");
		System.out.println("Connection Ok");

		Statement st=conn.createStatement();
		System.out.println("Statement Ok");
		
		ResultSet rs=st.executeQuery("select * from Register where username='"+username+"'and password='"+password+"'") ;
		System.out.println("Query executed succesfully");
	
		PrintWriter pw=response.getWriter();
		
		if(rs.next())
	    {
		pw.println("Login Success");
		
		String name=rs.getString(1);
		pw.println("Welcome to Lappify " +name);
		
		String pswd=rs.getString(2);
		String mail=rs.getString(3);
		String mob=rs.getString(4);
		
		}
	    else
	    {
		pw.print("Login Failed");
	    }
     
		conn.close();
        }
	     catch(Exception e)
	      {
		System.out.println("problem with database connection");
	      }
		}
}
