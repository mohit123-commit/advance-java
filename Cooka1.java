package cooka;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Cooka1")
public class Cooka1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Cooka1() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String dob=request.getParameter("dob");
		String address=request.getParameter("address");
		String adhar=request.getParameter("adhar");
		
		Cookie cdob=new Cookie("dob",dob);
		Cookie caddress=new Cookie("address",address);
		Cookie cadhar=new Cookie("adhar",adhar);
		
		response.addCookie(cdob);
		response.addCookie(caddress);
		response.addCookie(cadhar);
		
		PrintWriter out=response.getWriter();
		out.println("<form action='Cooka2' method='get'>");
		out.println("mail:<input type='text' name='mail'> <br><br>");
		out.println("password:<input type='text' name='password'> <br><br>");
		out.println("<input type='submit' value='next'>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
