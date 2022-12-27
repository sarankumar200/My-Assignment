package org.student;

import org.department.Departement;

public class Student extends Departement {
	public void studentName() {
		System.out.println("saran");}
	public void studentDept() {
		System.out.println("BCA");}
	public void studentId() {
		
		System.out.println("123");
	}
	public static void main(String[] args) {
		Student obj=new Student();
		obj.studentDept();
		obj.studentId();
		obj.studentName();
		obj.deptName();
		obj.collegeCode();
		obj.collegeName();
		obj.collegeRank();
	
	}

}
