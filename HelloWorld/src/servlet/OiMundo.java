package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OiMundo extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2994762734156054132L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>OlaMundo</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Ol�Mundo!</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}
