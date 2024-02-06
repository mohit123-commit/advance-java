package cook;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Cook")
public class Cook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public Cook() {
        super();
    
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		
		//make a cookie
		Cookie cname=new Cookie("name",name);
		Cookie cage=new Cookie("age",age);
		
		//add
		response.addCookie(cname);
		response.addCookie(cage);
		
		//new form
		PrintWriter out=response.getWriter();
		out.println("<form action='Cook1' method='get'>");
		out.println("contact:<input type='text' name='contact'> <br><br>");
		out.println("mail:<input type='text' name='mail'> <br><br>");
		out.println("<input type='submit' value='next'>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
