package com.ha.groups;

import com.ha.base.Person;

public class Student extends Person {

	private int studentRollno;
	private double studentPercentage;
	private String courseCode;
	
		
	
	// Setter 
	public void setStudentRollno(int studentRollno) {
		if (studentRollno > 100) {
			this.studentRollno = studentRollno;
		} else {
			System.out.println("Invalid RollNo ... ");
		}
		
	}
	
	public void setstudentPercentage(double studentPercentage) {
		
		if (studentPercentage >=0 && studentPercentage <=100 ) {
			this.studentPercentage = studentPercentage;
		}else {
			System.out.println("Invalid RollNo ... ");
		}
		
	}
	
	
	public void setcourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	
	// Getter
	public int getStudentRollno() {
		return this.studentRollno;
	}
	
	public double getstudentPercentage() {
		return this.studentPercentage;
	}
	
	public String getCourseCode() {
		return this.courseCode;
	}
	
	
	// print Student Details
	
	public void printStudentDetails() {
		System.out.println(" Student Id : " + this.studentRollno);
		System.out.println(" Student Name : " + super.getName());
		System.out.println(" Student PhoneNumber : " + super.getPhoneNumber());
		System.out.println(" Student Percentage : " + this.studentPercentage);
		System.out.println(" \n -------------------------------------    \n  ");
	}
	
	public void provideCertificate() {
		
		if (this.studentPercentage > 50) {
			System.out.println(" Student Id : " + this.studentRollno);
			System.out.println(" Student Name : " + super.getName());
			System.out.println("Passed!! Congrats");
			
			System.out.println(" \n -------------------------------------    \n  ");
		} else {
			System.out.println("Failed!! Please try again..");
		}
		
	}

}
