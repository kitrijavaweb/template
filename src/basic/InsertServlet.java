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
		//1. 요청정보추출
		req.setCharacterEncoding("euc-kr");
		resp.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = resp.getWriter();
		
		
		String deptNo = req.getParameter("deptNo");
		String deptName = req.getParameter("deptName");
		String loc = req.getParameter("loc");
		String tel = req.getParameter("tel");
		String mgr = req.getParameter("mgr");
		
		DeptDTO dept = new DeptDTO(deptNo, deptName, loc, tel, mgr);
		//2. 비지니스 메소드 호출
		DeptDAO dao = new DeptDAO();
		int result = dao.insert(dept);
		
		//3. 데이터 공유 
		String msg = "";
		if(result>=1){
			msg = result+"개 행 삽입성공!!";
		}else{
			msg = "삽입실패";
		}
		req.setAttribute("msg", msg);
		req.setAttribute("result", result);//컴파일러가 
										  //new Integer(result)
										   //코드를 생성
	
		//4. 요청재지정
		RequestDispatcher rd =
			req.getRequestDispatcher("/basic/insertResult.jsp");
		rd.forward(req, resp);
		
		
	}	
}











