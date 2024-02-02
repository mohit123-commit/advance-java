package university;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/University")
public class University extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public University() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name=request.getParameter("name");
		String fname=request.getParameter("fname");
		String mname=request.getParameter("mname");
		String contact=request.getParameter("contact");
		String college=request.getParameter("college");
		String roll=request.getParameter("roll");
		String stream=request.getParameter("stream");
		String[] year=request.getParameterValues("year");
		String address=request.getParameter("address");
		String hname=request.getParameter("hname");
		String hnumber=request.getParameter("hnumber");
		String caddress=request.getParameter("caddress");
		String gender=request.getParameter("gender");
		String[] game=request.getParameterValues("game");
		String category=request.getParameter("cate");
		String physical=request.getParameter("phy");
		String[] language=request.getParameterValues("lan");
		
		PrintWriter out=response.getWriter();
		out.println("name= "+name+"<br>");
		out.println("fname= "+fname+"<br>");
		out.println("mname= "+mname+"<br>");
		out.println("contact= "+contact+"<br>");
		out.println("college="+college+"<br>");
		out.println("roll number= "+roll+"<br>");
		out.println("stream= "+stream+"<br>");
		out.println("year= "+Arrays.toString(year)+"<br>");
		out.println("address= "+address+"<br>");
		out.println("HOD name= "+hname+"<br>");
		out.println("HOD number= "+hnumber+"<br>");
		out.println("college address= "+caddress+"<br>");
		out.println("gender= "+gender+"<br>");
		out.println("game= "+Arrays.toString(game)+"<br>");
		out.println("category= "+category+"<br>");
		out.println("physical= "+physical+"<br>");
		out.println("language= "+Arrays.toString(language)+"<br>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
