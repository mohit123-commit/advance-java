package cooka;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Cooka2")
public class Cooka2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Cooka2() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String mail=request.getParameter("mail");
		String password=request.getParameter("password");
		
		Cookie cmail=new Cookie("mail",mail);
		Cookie cpassword=new Cookie("password",password);
		
		response.addCookie(cmail);
		response.addCookie(cpassword);
	
		
		PrintWriter out=response.getWriter();
		out.println("<form action='Cooka3' method='get'>");
		out.println("qualification:<input type='text' name='qualification'> <br><br>");
		out.println("contact:<input type='text' name='contact'> <br><br>");
		out.println("<input type='submit' value='next'>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}