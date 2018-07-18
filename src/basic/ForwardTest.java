package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "forward", urlPatterns = { "/forward.do" })
public class ForwardTest extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = response.getWriter();
		
		System.out.println("forward연습 - ForwardTest실행중");
		pw.print("<h1>요청재지정 연습 - forward</h1>");
		
		//1. 요청정보 추출
		String data = request.getParameter("test");
		System.out.println("요청정보추출=>"+data);
		
		//2. 데이터 공유 - db에서 가져온 결과나 비지니스로직의 수행결과 
		DeptDTO dto = new DeptDTO("001","전산실","", "", "");
		request.setAttribute("mydata", dto);
		request.setAttribute("menupath", "/layout/dept_menu.jsp");
		request.setAttribute("viewpath", "/basic/param.html");
		
		//3. 요청재지정 - forward
		RequestDispatcher rd =
			request.getRequestDispatcher("/layout/mainLayout.jsp");
		rd.forward(request, response);
				
		pw.print("<h1>요청재지정연습-end</h1>");
	}

}
