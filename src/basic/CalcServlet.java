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
		//0. 요청과 응답에 대한 설정
		req.setCharacterEncoding("euc-kr");
		resp.setContentType("text/html;charset=euc-kr");
		//1. 요청정보추출
		int num1 = Integer.parseInt(req.getParameter("num1")); 
		int num2 = Integer.parseInt(req.getParameter("num2"));
		String opr = req.getParameter("method");
		
		//2. 비지니스메소드 call
		Calc logic = new Calc();
		int result = logic.calc(num1, num2, opr);
		
		//3. 결과화면(응답화면) 생성
		PrintWriter pw = resp.getWriter();//클라이언트에게 응답할 수 있는
		                                  //출력스트림을 구한다.
		pw.print("<h1>계산결과("+opr+"연산적용)</h1>");
		pw.print("<hr/>");
		pw.print("<h2>num1의 "+num1+"과 num2의 "+num2+"을 </h2>");
		pw.print("<h2>연산한 결과는 "+result+"입니다. </h2>");
	   
	}	
}










