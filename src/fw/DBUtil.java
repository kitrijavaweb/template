package fw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//DB������ ���õ� ����� ��ƿ��Ƽó�� �����ϴ� Ŭ���� - static�޼ҵ�� ����
public class DBUtil {
	// 1. ����̹��ε� - Ŭ������ �ε��ɶ� �� �� ����ȴ�.
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// 2. DB������ �����ؼ� ��������(Connection)�� �����ϴ� �޼ҵ�
	public static Connection getConnection() {
		// ������ Ŀ�ؼ��� ���� �����ϵ��� ����
		Connection con = null;
		String url = "jdbc:oracle:thin:@192.168.9.44:1521:xe";
		String user = "scott";
		String password = "tiger";
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	// 3. �ڿ��ݳ��޼ҵ� - ������ �ڿ��� �ݳ��� �� �ֵ��� �޼ҵ带 ����
	// => �Ѳ����� �ݳ�
	public static void close(ResultSet rs, Statement ptmt, Connection con) {
		try {
			if (rs != null)
				rs.close();
			if (ptmt != null)
				ptmt.close();
			if (con != null)
				con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// ResultSet�ݳ�
	public static void close(ResultSet rs) {
		try {
			if (rs != null)rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	// Statement�ݳ�
	public static void close(Statement stmt) {
		try {
			if (stmt != null)stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//Connection�ݳ�
	public static void close(Connection con) {
		try {
			if (con != null)con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}










