import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 
 */
@WebServlet("/servelet")
public class FirstServeletApp extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String name = request.getParameter("name");
        String city = request.getParameter("city");

        if (name == null) name = "";
        if (city == null) city = "";

        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter writer = response.getWriter()) {
            writer.println("<!DOCTYPE html>");
            writer.println("<html>");
            writer.println("<head><title>OUTPUT</title></head>");
            writer.println("<body style='background-color:cyan;'>");
            writer.println("<h1><marquee>THIS IS THE OUTPUT</marquee></h1>");
            writer.println("<table border='1'>");
            writer.println("<tr><th>Name</th><th>City</th></tr>");
            writer.println("<tr><td>" + name + "</td><td>" + city + "</td></tr>");
            writer.println("</table>");
            writer.println("</body>");
            writer.println("</html>");
        }
    }
}
	