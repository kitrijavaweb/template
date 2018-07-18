package basic;


//kitridept테이블의 한 레코드를 표현해 놓은 클래스
public class DeptDTO{
	private String deptNo;
	private String deptName;
	private String loc;
	private String tel;
	private String mgr;
	public DeptDTO(){
		System.out.println("기본생성자");
	}
	//insert용
	public DeptDTO(String deptNo, String deptName, String loc, String tel,
			String mgr) {
		super();
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.loc = loc;
		this.tel = tel;
		this.mgr = mgr;
	}

	@Override
	public String toString() {
		return "DeptDTO [deptNo=" + deptNo + ", deptName=" + deptName
				+ ", loc=" + loc + ", tel=" + tel + ", mgr=" + mgr + "]";
	}
	public String getDeptNo() {
		System.out.println("getDeptNo()");
		return deptNo;
	}
	public void setDeptNo(String deptNo) {
		System.out.println("setDeptNo()");
		this.deptNo = deptNo;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getMgr() {
		return mgr;
	}
	public void setMgr(String mgr) {
		this.mgr = mgr;
	}
	
}












