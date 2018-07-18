package basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		  	throws ServletException, IOException {
		//�����Ͻ��޼ҵ� ȣ��
		DeptDAO dao = new DeptDAO();
		ArrayList<DeptDTO> deptlist = dao.select();
		
		//������ ����
		req.setAttribute("deptlist", deptlist);
		
		//��û������
		RequestDispatcher rd =
				req.getRequestDispatcher("/basic/list.jsp");
		rd.forward(req, resp);
			
	}

}











