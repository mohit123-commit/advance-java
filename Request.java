package request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Request")
public class Request extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public Request() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//generate request
		response.setContentType("text/html");
		String email=request.getParameter("mail");
		String password=request.getParameter("pass");
		
		//generate response
		PrintWriter out=response.getWriter();
		if(email.equals("abc") && password.equals("123"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("Welcome");
			//how to go to another servlet
			rd.forward(request, response);
		}
		else if(email.equals("") && password.equals(""))
		{
			RequestDispatcher rd=request.getRequestDispatcher("request.html");
			rd.include(request, response);
		}
		else if(!(email.equals("abc") && password.equals("123")))
		{
			RequestDispatcher rd=request.getRequestDispatcher("request.html");
			rd.include(request, response);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
