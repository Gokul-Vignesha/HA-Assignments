package com.healthasyst.student;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Student creating object and initializing variables
		Student s1 = new Student("jack","jack@gmail.com",45.2);
		Student s2 = new Student("peter","peter@gmail.com",85.2);
		Student s3 = new Student("mark","mark@gmail.com",56.5);
		Student s4 = new Student("mark","markmamamail.com",56.5);
	
		
		//setting values to SchoolName 
		Student.setSchoolName("Global School");
		
		// printing Student Details
//		s1.printingStudentDetails();
//		s2.printingStudentDetails();
//		s3.printingStudentDetails();

		s1.setStudentPercentage(98.3);
		
//		System.out.println(s1.getStudentPercentage());
		
		s2.printingStudentDetails();
		s3.printingStudentDetails();
		
		s4.printingStudentDetails();
		
	}

}
