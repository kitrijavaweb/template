package basic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import fw.DBUtil;

public class DeptDAO {
	public int delete(String deptNo){
		Connection con = null;
		PreparedStatement ptmt = null;
		String sql = "delete from kitridept where deptno=?";
		int result= 0;
		try {
			con = DBUtil.getConnection();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, deptNo);
			result = ptmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBUtil.close(null, ptmt, con);
		}
		return result;
	}
	public ArrayList<DeptDTO> select(){
		ArrayList<DeptDTO> deptlist = new ArrayList<DeptDTO>();
		Connection con = null;
		PreparedStatement ptmt = null;
		String sql = "select * from kitridept";
		ResultSet rs = null;
		DeptDTO dept = null;//하나의 레코드를 담을 객체 - 레코드를 조회하면서 하나씩 만들어서
		                    //                 넣어야 한다.
		try {
			con = DBUtil.getConnection();
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			while(rs.next()){
				dept = new DeptDTO(rs.getString(1),rs.getString(2),
						rs.getString(3),rs.getString(4),rs.getString(5));
				deptlist.add(dept);
			}
			System.out.println("dao"+deptlist.size());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(rs, ptmt, con);
		}
		return deptlist;
	}
	
	public int insert(DeptDTO dept){
		Connection con = null;
		PreparedStatement ptmt = null;
		String sql = "insert into kitridept values(?,?,?,?,?)";
		int result= 0;
		try {
			con = DBUtil.getConnection();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, dept.getDeptNo());
			ptmt.setString(2, dept.getDeptName());
			ptmt.setString(3, dept.getLoc());
			ptmt.setString(4, dept.getTel());
			ptmt.setString(5, dept.getMgr());
			result = ptmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBUtil.close(null, ptmt, con);
		}
		return result;
	}
}








