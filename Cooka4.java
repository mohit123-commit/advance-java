package cooka;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Cooka4")
public class Cooka4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Cooka4() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String enrollment=request.getParameter("enrollment");
		
		Cookie[] cookie=request.getCookies();
		String name=cookie[0].getValue();
		String fname=cookie[1].getValue();
		String mname=cookie[2].getValue();
		String dob=cookie[3].getValue();
		String address=cookie[4].getValue();
		String adhar=cookie[5].getValue();
		String mail=cookie[6].getValue();
		String password=cookie[7].getValue();
		String qualification=cookie[8].getValue();
		String contact=cookie[9].getValue();
		

		PrintWriter out=response.getWriter();
		out.println("name: "+name+"<br>");
		out.println("fname: "+fname+"<br>");
		out.println("mname: "+mname+"<br>");
		out.println("dob: "+dob+"<br>");
		out.println("address: "+address+"<br>");
		out.println("adhar: "+adhar+"<br>");
		out.println("contact: "+contact+"<br>");
		out.println("mail: "+mail+"<br>");
		out.println("qualification: "+qualification+"<br>");
		out.println("password: "+password+"<br>");
		out.println("enrollment: "+enrollment+"<br>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}