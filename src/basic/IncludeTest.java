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
		
		System.out.println("include���� - IncludeTest������");
		pw.print("<h1>��û������ ���� - include</h1>");
		
		//1. ��û���� ����
		String data = request.getParameter("test");
		System.out.println("��û��������=>"+data);
		
		//2. ������ ���� - db���� ������ ����� �����Ͻ������� ������ 
		DeptDTO dto = new DeptDTO("001","�����","", "", "");
		request.setAttribute("mydata", dto);
		
		//3. ��û������ - include
		RequestDispatcher rd =
			request.getRequestDispatcher("/jspbasic/result.jsp");
		rd.include(request, response);
				
		pw.print("<h1>��û����������-end</h1>");
	}

}
