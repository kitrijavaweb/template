package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "include", urlPatterns = { "/include.do" })
public class IncludeTest extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = response.getWriter();
		
		System.out.println("include연습 - IncludeTest실행중");
		pw.print("<h1>요청재지정 연습 - include</h1>");
		
		//1. 요청정보 추출
		String data = request.getParameter("test");
		System.out.println("요청정보추출=>"+data);
		
		//2. 데이터 공유 - db에서 가져온 결과나 비지니스로직의 수행결과 
		DeptDTO dto = new DeptDTO("001","전산실","", "", "");
		request.setAttribute("mydata", dto);
		
		//3. 요청재지정 - include
		RequestDispatcher rd =
			request.getRequestDispatcher("/jspbasic/result.jsp");
		rd.include(request, response);
				
		pw.print("<h1>요청재지정연습-end</h1>");
	}

}
