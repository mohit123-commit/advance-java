package cooka;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Cooka3")
public class Cooka3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Cooka3() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String qualification=request.getParameter("qualification");
		String contact=request.getParameter("contact");
		
		Cookie cqualification=new Cookie("qualification",qualification);
		Cookie ccontact=new Cookie("contact",contact);
		
		response.addCookie(cqualification);
		response.addCookie(ccontact);
	
		
		PrintWriter out=response.getWriter();
		out.println("<form action='Cooka4' method='get'>");
		out.println("enrollment:<input type='text' name='enrollment'> <br><br>");
		out.println("<input type='submit' value='next'>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
