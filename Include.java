package Include;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Include
 */
@WebServlet("/Include")
public class Include extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Include() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//generate request
				response.setContentType("text/html");
				String name=request.getParameter("name");
				String fname=request.getParameter("f");
				String mname=request.getParameter("m");
				String contact=request.getParameter("contact");
				
				//generate response
				PrintWriter out=response.getWriter();
				if(name.equals("mohit") && fname.equals("ganesh") && mname.equals("mithlesh") && contact.equals("8875505252"))
				{
					RequestDispatcher rd=request.getRequestDispatcher("Welcome");
					//how to go to another servlet
					rd.forward(request, response);
				}
	
				else 
				{
					RequestDispatcher rd=request.getRequestDispatcher("include.html");
					rd.include(request, response);
				}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
