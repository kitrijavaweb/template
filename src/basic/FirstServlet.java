package basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	public void service(HttpServletRequest req
				    ,HttpServletResponse res)
						throws ServletException,IOException{
		res.setContentType("text/html;charset=euc-kr");
		System.out.println("서블릿 요청 성공");
	}
}
