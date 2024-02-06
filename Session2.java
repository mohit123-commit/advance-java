package session2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Session2")
public class Session2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public Session2() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		String contact=request.getParameter("contact");
		String email=request.getParameter("email");
		
		PrintWriter out=response.getWriter();
		out.println("<h1>Education Details</h1>");
		out.println("<form action='Session3' method='get'>");
		out.println("qualification:<input type='text' name='qualification'> <br><br>");
		out.println("university:<input type='text' name='university'> <br><br>");
		
		//adding hidden form elements
				out.println("<input type='hidden' name='name' value="+name+"><br> ");
				out.println("<input type='hidden' name='age' value="+age+"><br> ");
				
				out.println("<input type='hidden' name='contact' value="+contact+"><br> ");
				out.println("<input type='hidden' name='email' value="+email+"><br> ");
				
		out.println("<input type='submit' value='submit'>");
		out.println("</form>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
