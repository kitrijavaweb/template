package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("euc-kr");
		resp.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = resp.getWriter();
			
		String deptNo = req.getParameter("deptNo");
		DeptDAO dao = new DeptDAO();
		int result = dao.delete(deptNo);
		
		resp.sendRedirect("/serverweb/list.do");
		
		//3. ���ȭ�� ����
		
	/*	if(result>=1){
			pw.print("<h1>"+result+"�� �� ��������!!</h1>");
		}else{
			pw.print("<h1>��������</h1>");
		}*/
				
	}
	
}
