package month;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Month")
public class Month extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Month() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String month=request.getParameter("month");
		
		int number=Integer.parseInt(month);
		PrintWriter out=response.getWriter();
		
		switch(number) {
		case 1: out.println(number+" january");
		break;
		case 2: out.println(number+" feburary");
		break;
		case 3: out.println(number+" march");
		break;
		case 4: out.println(number+" april");
		break;
		case 5: out.println(number+" may");
		break;
		case 6: out.println(number+" june");
		break;
		case 7: out.println(number+" july");
		break;
		case 8: out.println(number+" augest");
		break;
		case 9: out.println(number+" september");
		break;
		case 10: out.println(number+" october");
		break;
		case 11: out.println(number+" november");
		break;
		case 12: out.println(number+" december");
		break;
		default:
			out.println("number must be less then 13");
		}
		
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
