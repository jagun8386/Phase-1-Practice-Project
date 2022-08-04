package validationmail;
	import java.io.IOException;
	import java.io.PrintWriter;

	import javax.servlet.ServletException;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	public class DisplayServlet extends HttpServlet {
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			 
			PrintWriter out= resp.getWriter();
			resp.setContentType("text/html");
			
			String username= req.getParameter("uname");
			String password= req.getParameter("pass");
			out.println("Hello "+ username+"!");
			out.println("<br>");
			out.println("You have Loginned Successfully ");
			out.println("<br>");
			out.println("Your Password is "+password);
			out.println("<br>");
			out.println("<a href='logout'>Logout</a>");
	}
	}

