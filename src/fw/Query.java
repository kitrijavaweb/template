package fw;
//SQL�� �����ϴ� Ŭ���� - �����ӿ�ũ ������� ������Ʈ�� �ϴ� ��� XML���·� ����
public class Query {
	public static String DEPT_DELETE
		= "delete from kitridept where deptno = ?";
	public static String DEPT_SELECT = "select * from kitridept";
	public static String DEPT_INSERT
	      ="insert into kitridept values(?,?,?,?,?)";
	public static String DEPT_SEARCH
	 ="select * from kitridept where deptname like ?";

}







