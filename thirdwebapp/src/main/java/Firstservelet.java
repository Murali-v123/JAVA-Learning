

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/Firstservelet")
public class Firstservelet extends HttpServlet {


	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("Output from first servelet");
		RequestDispatcher reqdis = request.getRequestDispatcher("/Secondservlet");
		String name=request.getParameter("name");
		String city=request.getParameter("name");
		HttpSession session=request.getSession();
		session.setAttribute("name", name);
		session.setAttribute("city", city);
		reqdis.forward(request, response);
//		reqdis.include(request, response);
		PrintWriter writer = response.getWriter();
		writer.println("Hello from first servelet");
		writer.close();
	}

}
