package cook;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Cook2")
public class Cook2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Cook2() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Cookie[] cookie=request.getCookies();
		String name=cookie[0].getValue();
		String age=cookie[1].getValue();
		String contact=cookie[2].getValue();
		String mail=cookie[3].getValue();
		
		response.setContentType("text/html");
		String qualification=request.getParameter("qualification");
		String university=request.getParameter("university");
		
		PrintWriter out=response.getWriter();
		out.println("name: "+name+"<br>");
		out.println("age: "+age+"<br>");
		out.println("contact: "+contact+"<br>");
		out.println("email: "+mail+"<br>");
		out.println("qualification: "+qualification+"<br>");
		out.println("university: "+university+"<br>");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
