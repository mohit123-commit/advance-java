package college;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class College
 */
@WebServlet("/College")
public class College extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public College() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name=request.getParameter("name");
		String fname=request.getParameter("f");
		String mname=request.getParameter("m");
		String college=request.getParameter("col");
		String address=request.getParameter("add");
		
		PrintWriter out=response.getWriter();
		out.println("name= "+name);
		out.println("fname= "+fname);
		out.println("mname= "+mname);
		out.println("college= "+college);
		out.println("address= "+address);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
