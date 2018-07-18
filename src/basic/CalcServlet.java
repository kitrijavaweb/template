package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalcServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req,
				HttpServletResponse resp)
						throws ServletException, IOException {
		//0. ��û�� ���信 ���� ����
		req.setCharacterEncoding("euc-kr");
		resp.setContentType("text/html;charset=euc-kr");
		//1. ��û��������
		int num1 = Integer.parseInt(req.getParameter("num1")); 
		int num2 = Integer.parseInt(req.getParameter("num2"));
		String opr = req.getParameter("method");
		
		//2. �����Ͻ��޼ҵ� call
		Calc logic = new Calc();
		int result = logic.calc(num1, num2, opr);
		
		//3. ���ȭ��(����ȭ��) ����
		PrintWriter pw = resp.getWriter();//Ŭ���̾�Ʈ���� ������ �� �ִ�
		                                  //��½�Ʈ���� ���Ѵ�.
		pw.print("<h1>�����("+opr+"��������)</h1>");
		pw.print("<hr/>");
		pw.print("<h2>num1�� "+num1+"�� num2�� "+num2+"�� </h2>");
		pw.print("<h2>������ ����� "+result+"�Դϴ�. </h2>");
	   
	}	
}










