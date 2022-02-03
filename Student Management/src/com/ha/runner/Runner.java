package com.ha.runner;

import com.ha.groups.Student;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu1 = new Student();
		
		stu1.setStudentRollno(101);
		stu1.setName("John Wick");
		stu1.setPhoneNumber(8796543201L);
		stu1.setstudentPercentage(80.5);
		
		stu1.printStudentDetails();
		stu1.provideCertificate();

	}

}
