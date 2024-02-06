package Session3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Session3")
public class Session3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Session3() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		
		String contact=request.getParameter("contact");
		String email=request.getParameter("email");
		
		String qualification=request.getParameter("qualification");
		String university=request.getParameter("university");
		
		PrintWriter out=response.getWriter();
		out.println("name: "+name+"<br>");
		out.println("age: "+age+"<br>");
		out.println("contact: "+contact+"<br>");
		out.println("email: "+email+"<br>");
		out.println("qualification: "+qualification+"<br>");
		out.println("university: "+university+"<br>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
