

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class FirstServeletApp
 */
@WebServlet("/servelet")
public class FirstServeletApp extends HttpServlet {

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name=request.getParameter("name");
		String city=request.getParameter("city");
		
//		response.setContentType("text/html");
		
		PrintWriter writer = response.getWriter();
		writer.println(name);
		writer.println(city);
		
		writer.close();
	}

}
