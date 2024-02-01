package form;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Arrays;


@WebServlet("/Form")
public class Form extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Form() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String gender=request.getParameter("gender");
		String address=request.getParameter("address");
		String quali=request.getParameter("quali");
		String[] skills=request.getParameterValues("skills");
		String[] hob=request.getParameterValues("hob");
		
		//response
		PrintWriter out=response.getWriter();
		out.println("name :"+name+"<br>");
		out.println("gender :"+gender+"<br>");
		out.println("password :"+password+"<br>");
		out.println("address :"+address+"<br>");
		out.println("qualification :"+quali+"<br>");
		out.println("skills :"+Arrays.toString(skills)+"<br>");
		out.println("hobbies :"+Arrays.toString(hob)+"<br>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
