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
		//응답메시지에 대한 형식과 문자셋셋팅
		res.setContentType("text/html;charset=euc-kr");
		//요청정보에 대한 한글처리
		req.setCharacterEncoding("euc-kr");
		//브라우저로 응답정보를 내보내기 위해서 출력스트림을 구한다.
		PrintWriter pw = res.getWriter();
		//요청정보를 추출
		String id = req.getParameter("id");
		String pass = req.getParameter("pass");
	
		System.out.println("아이디:"+id);
		System.out.println("패스워드:"+pass);
		
		//응답데이터를 작성
		pw.print("<h1>아이디:"+id+"</h1>");
		pw.print("<h1>패스워드:"+pass+"</h1>");
	}
}







