package fw;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * �����۸�ũ�� Ŭ���c�� �並 ��Ÿ���� ȣ��� ����
 * �������ο��� mainLayout.jsp�� forward�Ǹ�
 * ���ð� ���� ���������� left�޴� �κп� ����� view�� ������ ������ �κп� ����� view�� ������ �Ѱ��ִ�
 * ����
 * ������ .properties���� �̳� xml�� ���� ���� ���Ͽ� view�� ���� ������ ����ϰ� �Ľ��ؼ� 
 * ������ �����;� ������ Ŭ���Ҷ� �Ķ���ͷ� �信 ���� ������ �ѱ��.
 * ���ʿ� ����� �信 ���� ������ menupath��� �Ķ���ͷ� �ѱ��.
 * �����ʿ� ����� �信 ���� ������ viewpath��� �Ķ���ͷ� �ѱ��.
 * */
@WebServlet(name = "view", urlPatterns = { "/view.html" })
public class ViewTemplateServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String menupath =request.getParameter("menupath");
		String viewpath = request.getParameter("viewpath");
		System.out.println(menupath+":"+viewpath);
		//���ø� �������� �����Ҷ��� ������ mainLayout.jsp�� forward�ϰ�
		//forward�ϱ� ���� ���ø� �������� ������ view�� ������ request�� �����ؾ� �Ѵ�.
		
		request.setAttribute("menupath", menupath);
		request.setAttribute("viewpath", viewpath);
		RequestDispatcher rd=
				request.getRequestDispatcher("/layout/mainLayout.jsp");
		rd.forward(request, response);
		
	}

}
