package detail;

import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Detail
 */
@WebServlet("/Detail")
public class Detail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Detail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name=request.getParameter("name");
		String fname=request.getParameter("fname");
		String mname=request.getParameter("mname");
		String gender=request.getParameter("gender");
		String clas=request.getParameter("class");
		String contact=request.getParameter("contact");
		String address=request.getParameter("address");
		
		PrintWriter out=response.getWriter();
		out.println("name :"+name+"<br>");
		out.println("fname :"+fname+"<br>");
		out.println("mname :"+mname+"<br>");
		out.println("gender :"+gender+"<br>");
		out.println("class :"+clas+"<br>");
		out.println("contact :"+contact+"<br>");
		out.println("address :"+address+"<br>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
