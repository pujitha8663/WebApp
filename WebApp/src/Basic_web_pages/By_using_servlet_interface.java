package Basic_web_pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class By_using_servlet_interface implements Servlet{

	@Override
	public void destroy() {
		System.out.println("Servlet is destroy....");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
	 System.out.println("servlet is insilaized");
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter r= res.getWriter();
		res.setContentType("text/html");
		
		r.print("<html>");
		r.print("<head>");
		r.print("<h1>welcome to create id</h1>");
		r.print("</head>");
		r.print("</html>");
	}

}
