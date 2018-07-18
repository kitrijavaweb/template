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
		
		System.out.println("sendRedirect���� - RedirectTest������");
		pw.print("<h1>��û������ ���� - sendRedirect</h1>");
		
		//1. ��û���� ����
		String data = request.getParameter("test");
		System.out.println("��û��������=>"+data);
		
		//2. ������ ���� - db���� ������ ����� �����Ͻ������� ������ 
		DeptDTO dto = new DeptDTO("001","�����","", "", "");
		request.setAttribute("mydata", dto);
		
		//3. ��û������
		response.sendRedirect("/serverweb/jspbasic/result.jsp");		
		
	}

}
