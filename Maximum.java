package maximun;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Maximum")
public class Maximum extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Maximum() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String n1=request.getParameter("n1");
		String n2=request.getParameter("n2");
		String n3=request.getParameter("n3");
		
		int nm1=Integer.parseInt(n1);
		int nm2=Integer.parseInt(n2);
		int nm3=Integer.parseInt(n3);
		
		PrintWriter out=response.getWriter();
		
		if(nm1>nm2 && nm1>nm3)
		{
			out.println(nm1+" is maximun");
		}
		if(nm2>nm1 && nm2>nm3)
		{
			out.println(nm2+" is maximun");
		}
		else
		{
			out.println(nm3+" is maximun");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
