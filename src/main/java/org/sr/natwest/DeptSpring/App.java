package org.sr.natwest.DeptSpring;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        Scanner s = new Scanner (System.in);
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        DepartmentCrud deptCrud = (DepartmentCrud)ctx.getBean("departmentCrud");
        Department department = (Department)ctx.getBean("department");
        
        //insert a record
        
        System.out.println("Input the below details:\nDepartment ID:\nDepartment Name:\nLocation:");
        department.setDeptid(s.nextInt());
        department.setDeptname(s.next());
        department.setLocation(s.next());
        
        deptCrud.insertDepartment(department);
        
        //to delete a record by deptId
        
//        System.out.println("Enter the DeptID to delete a record: ");
//        
//        deptCrud.deleteDepartment(s.nextInt());
        
        //to find a dept with id
//        System.out.println("Please enter DeptId to Find a record: ");
//    	deptCrud.FindARecordUsingRowMapper(s.nextInt()).stream().forEach(System.out::println);
        
        //to update the record
        
//        System.out.println("Please Input the below to update\nDepartment ID:\nDepartment Name:\nLocation:\n");
//    	department.setDeptid(s.nextInt());
//    	department.setDeptname(s.next());
//    	department.setLocation(s.next());
//    	
//    	deptCrud.updateDepartment(department);
    	
//    	deptCrud.getAllDepartmentUsingRowMapper().stream().forEach(System.out::println);
        
    }
}
