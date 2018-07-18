package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "redirect", urlPatterns = { "/redirect.do" })
public class SendRedirectTest extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = response.getWriter();
		
		System.out.println("sendRedirect연습 - RedirectTest실행중");
		pw.print("<h1>요청재지정 연습 - sendRedirect</h1>");
		
		//1. 요청정보 추출
		String data = request.getParameter("test");
		System.out.println("요청정보추출=>"+data);
		
		//2. 데이터 공유 - db에서 가져온 결과나 비지니스로직의 수행결과 
		DeptDTO dto = new DeptDTO("001","전산실","", "", "");
		request.setAttribute("mydata", dto);
		
		//3. 요청재지정
		response.sendRedirect("/serverweb/jspbasic/result.jsp");		
		
	}

}
