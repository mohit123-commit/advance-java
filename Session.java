package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Session")
public class Session extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public Session() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		
		PrintWriter out=response.getWriter();
		out.println("<h1>contact information</h1>");
		out.println("<form action='Session2' method='get'>");
		out.println("contact:<input type='text' name='contact'> <br><br>");
		out.println("email:<input type='text' name='email'> <br><br>");
		
		//adding hidden form elements
		out.println("<input type='hidden' name='name' value="+name+"><br> ");
		out.println("<input type='hidden' name='age' value="+age+"><br> ");
		out.println("<input type='submit' value='next'>");
		out.println("</form>");
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
