package fw;
//SQL만 정의하는 클래스 - 프레임워크 기반으로 프로젝트를 하는 경우 XML형태로 변경
public class Query {
	public static String DEPT_DELETE
		= "delete from kitridept where deptno = ?";
	public static String DEPT_SELECT = "select * from kitridept";
	public static String DEPT_INSERT
	      ="insert into kitridept values(?,?,?,?,?)";
	public static String DEPT_SEARCH
	 ="select * from kitridept where deptname like ?";

}







