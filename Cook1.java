package cook;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Cook1")
public class Cook1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Cook1() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String contact=request.getParameter("contact");
		String mail=request.getParameter("mail");
		
		//make a cookie
		Cookie ccontact=new Cookie("contact",contact);
		Cookie cmail=new Cookie("mail",mail);
		
		//add cookie
		response.addCookie(ccontact);
		response.addCookie(cmail);
		
		//new form
		PrintWriter out=response.getWriter();
		out.println("<form action='Cook2' method='get'>");
		out.println("qualification:<input type='text' name='qualification'> <br><br>");
		out.println("university:<input type='text' name='university'> <br><br>");
		out.println("<input type='submit' value='next'>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
