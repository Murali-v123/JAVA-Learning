
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servelet")
public class ServeletApp extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		String name=request.getParameter("name");
		String city=request.getParameter("city");
		
		
		response.sendRedirect("/ServeletApp2/Sucess.jsp");
		if(name.equals("murali") && city.equals("bangarpet")) {
			System.out.println("The right Person");
			// This automatically grabs the correct application root path
//			response.sendRedirect(request.getContextPath() + "/Sucess.jsp");

		}
		else {
			System.out.println("The wrong person");
		}
		
	}


}
