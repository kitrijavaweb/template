package basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycleServlet extends HttpServlet {
	public LifeCycleServlet() {
		System.out.println("¼­ºí¸´°´Ã¼»ý¼º...");
	}

	public void init() {
		System.out.println("init()");
	}

	public void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		System.out.println("service()"+req.getMethod());
		if(req.getMethod().equals("GET")){
			doGet(req, res);
		}else{
			doPost(req, res);
		}
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		System.out.println("doGet()");
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		System.out.println("doPost()");
	}
	public void destroy() {
		System.out.println("destroy()");
	}
}
