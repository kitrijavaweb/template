package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//1. ��û��������
		req.setCharacterEncoding("euc-kr");
		resp.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = resp.getWriter();
		
		
		String deptNo = req.getParameter("deptNo");
		String deptName = req.getParameter("deptName");
		String loc = req.getParameter("loc");
		String tel = req.getParameter("tel");
		String mgr = req.getParameter("mgr");
		
		DeptDTO dept = new DeptDTO(deptNo, deptName, loc, tel, mgr);
		//2. �����Ͻ� �޼ҵ� ȣ��
		DeptDAO dao = new DeptDAO();
		int result = dao.insert(dept);
		
		//3. ������ ���� 
		String msg = "";
		if(result>=1){
			msg = result+"�� �� ���Լ���!!";
		}else{
			msg = "���Խ���";
		}
		req.setAttribute("msg", msg);
		req.setAttribute("result", result);//�����Ϸ��� 
										  //new Integer(result)
										   //�ڵ带 ����
	
		//4. ��û������
		RequestDispatcher rd =
			req.getRequestDispatcher("/basic/insertResult.jsp");
		rd.forward(req, resp);
		
		
	}	
}











