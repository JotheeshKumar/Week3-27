package org.student;

import org.department.Department;

public class Student extends Department{

	public static void studentName() {
		System.out.println("Name :Joe");
	}
	public static void studentDept() {
		System.out.println("Dept: ECE");
	}
	public static void studentId() {
		System.out.println("Id: jm625628");
		
	}
	public static void main(String[] args) {
		Student st = new Student();
		st.collegeName();
		
		st.collegeCode();
		
		st.collegeRank();
		
		st.deptName();
		
		st.studentName();
		
		st.studentId();
		
		st.studentDept();
	}	
}
