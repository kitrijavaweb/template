package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ParamTestServlet extends HttpServlet{
	public void doPost(HttpServletRequest req,
				HttpServletResponse res)
						throws ServletException,IOException{
		//����޽����� ���� ���İ� ���ڼ¼���
		res.setContentType("text/html;charset=euc-kr");
		//��û������ ���� �ѱ�ó��
		req.setCharacterEncoding("euc-kr");
		//�������� ���������� �������� ���ؼ� ��½�Ʈ���� ���Ѵ�.
		PrintWriter pw = res.getWriter();
		//��û������ ����
		String id = req.getParameter("id");
		String pass = req.getParameter("pass");
	
		System.out.println("���̵�:"+id);
		System.out.println("�н�����:"+pass);
		
		//���䵥���͸� �ۼ�
		pw.print("<h1>���̵�:"+id+"</h1>");
		pw.print("<h1>�н�����:"+pass+"</h1>");
	}
}







