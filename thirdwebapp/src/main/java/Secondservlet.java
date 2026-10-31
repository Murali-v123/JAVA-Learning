

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Secondservlet")
public class Secondservlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session=request.getSession(false);
		String name=(String) session.getAttribute("name");
		String city=(String) session.getAttribute("city");
		PrintWriter writer = response.getWriter();
		writer.println("<h1>Hello from second servelet</h1>"+"<h1>"+name+"</h1>");
		writer.println("<h1>city</h1>"+"<h1>"+city+"</h1>");
		writer.close();
	}

}
