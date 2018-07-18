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
		//비지니스메소드 호출
		DeptDAO dao = new DeptDAO();
		ArrayList<DeptDTO> deptlist = dao.select();
		
		//데이터 공유
		req.setAttribute("deptlist", deptlist);
		
		//요청재지정
		RequestDispatcher rd =
				req.getRequestDispatcher("/basic/list.jsp");
		rd.forward(req, resp);
			
	}

}











