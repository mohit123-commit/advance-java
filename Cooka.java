package cooka;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Cooka")
public class Cooka extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Cooka() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name=request.getParameter("name");
		String fname=request.getParameter("fname");
		String mname=request.getParameter("mname");
		
		Cookie cname=new Cookie("name",name);
		Cookie cfname=new Cookie("fname",fname);
		Cookie cmname=new Cookie("mname",mname);
		
		response.addCookie(cname);
		response.addCookie(cfname);
		response.addCookie(cmname);
		
		PrintWriter out=response.getWriter();
		out.println("<form action='Cooka1' method='get'>");
		out.println("dob:<input type='text' name='dob'> <br><br>");
		out.println("address:<input type='text' name='address'> <br><br>");
		out.println("adhar:<input type='text' name='adhar'> <br><br>");
		out.println("<input type='submit' value='next'>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
