package Basic_web_pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Generics_servlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter g = res.getWriter();
		res.setContentType("text/html");
		g.print("<html>");
		g.print("<head>");
		g.print("<i>pujitha marka</i>");
		g.print("</head>");
		g.print("</html>");
		
	}
	

}
