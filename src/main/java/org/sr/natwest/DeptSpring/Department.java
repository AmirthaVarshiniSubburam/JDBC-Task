package org.sr.natwest.DeptSpring;

public class Department {
	private Integer deptid;
	private String deptname;
	private String location;
	public Department(Integer deptid, String deptname, String location) {
		super();
		this.deptid = deptid;
		this.deptname = deptname;
		this.location = location;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getDeptid() {
		return deptid;
	}
	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", deptname=" + deptname + ", location=" + location + "]";
	}
	
	

}
