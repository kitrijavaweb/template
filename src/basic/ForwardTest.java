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
		
		System.out.println("forward���� - ForwardTest������");
		pw.print("<h1>��û������ ���� - forward</h1>");
		
		//1. ��û���� ����
		String data = request.getParameter("test");
		System.out.println("��û��������=>"+data);
		
		//2. ������ ���� - db���� ������ ����� �����Ͻ������� ������ 
		DeptDTO dto = new DeptDTO("001","�����","", "", "");
		request.setAttribute("mydata", dto);
		request.setAttribute("menupath", "/layout/dept_menu.jsp");
		request.setAttribute("viewpath", "/basic/param.html");
		
		//3. ��û������ - forward
		RequestDispatcher rd =
			request.getRequestDispatcher("/layout/mainLayout.jsp");
		rd.forward(request, response);
				
		pw.print("<h1>��û����������-end</h1>");
	}

}
