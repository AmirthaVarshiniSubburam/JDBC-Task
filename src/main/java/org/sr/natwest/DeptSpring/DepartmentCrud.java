package org.sr.natwest.DeptSpring;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;



public class DepartmentCrud {

	JdbcTemplate jdbcTemplate;

		public DepartmentCrud() {
			super();
			// TODO Auto-generated constructor stub
		}

		public DepartmentCrud(JdbcTemplate jdbcTemplate) {
			super();
			this.jdbcTemplate = jdbcTemplate;
		}

		public JdbcTemplate getJdbcTemplate() {
			return jdbcTemplate;
		}

		public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
			this.jdbcTemplate = jdbcTemplate;
		}

//		@Override
//		public String toString() {
//			return "DepartmentCrud [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
//					+ super.toString() + "]";
//		} 
		
		public void insertDepartment(Department department) {
			Object[] params =
				{
						department.getDeptid(),
						department.getDeptname(),
						department.getLocation()
				};
		int recs = jdbcTemplate.update("insert into department values(?,?,?)", params);
		System.out.println(recs+"record(s) inserted"); 
		System.out.println(params.toString());
		}
		
		public void deleteDepartment(int deptid) {
			Object[] params = {deptid};
			
			int recs = jdbcTemplate.update("delete from department where deptid=?", params);
			System.out.println(recs+"Records are deleted");
									
		}
			
		public List<Department> FindARecordUsingRowMapper (int deptid){
			List<Department> deptList = jdbcTemplate.query("select* from department where deptid='"+deptid+"'", new RowMapper<Department>() {
				
				@Override
				public Department mapRow(ResultSet rs, int rowNum) throws SQLException {
					Department department = new Department();
					
					department.setDeptid(rs.getInt(1));
					department.setDeptname(rs.getString(2));
					department.setLocation(rs.getString(3));
					return department;
			}																														
					
		});
			
			return deptList;
			
			
		}			

		public void updateDepartment(Department department) {
			Object[] params = 
				{
						
					department.getDeptid(),
					department.getDeptname(),
					department.getLocation()
					
						
				};
			int recs = jdbcTemplate.update("update department set deptname=?,deptlocation=? where deptid=?", params);
			System.out.println(recs+" Record  Updated");
		
		}
	}
