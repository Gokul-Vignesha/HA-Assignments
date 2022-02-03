package com.healthasyst.student;

public class Student {

	private int studentRollno;
	private String studentName;
	private String studentMailid;
	private double studentPercentage;
	private static String schoolName;
	
	private static int counter =1001;
	
	public Student(String studentName, String studentMailid, double studentPercentage) {
		
		//this.studentRollno = StudentRollno;
		this.studentRollno = counter;
		this.studentName = studentName;
		this.studentPercentage = studentPercentage;
		counter++;
		if( studentMailid.contains("@")) {
			this.studentMailid = studentMailid;
		} else {
			System.out.println(" Student : " + this.studentRollno + " - " + this.studentName +" entered Invalid EmailID \n");
		}
		
	}
	
	public static void setSchoolName(String schoolName) {
		Student.schoolName = schoolName;
	}
	
	public void printingStudentDetails() {
		System.out.println(" Student RollNo     : " + this.studentRollno);
		System.out.println(" Student Name       : " + this.studentName);
		System.out.println(" Student MailID     : " + this.studentMailid);
		System.out.println(" Student Percentage : " + this.studentPercentage);
		System.out.println(" School Name        : " + Student.schoolName);
		System.out.println(" \n  -------------------------------------------------- \n ");
		
	}
	
	
	public void setStudentPercentage(double studentPercentage) {
		if( studentPercentage >=0 && studentPercentage <=100 ) {
			this.studentPercentage = studentPercentage;
		} else {
			System.out.println(" Student : " + this.studentRollno + " - " + this.studentName +" entered Invalid Percentage! \n");
		}
	}

	public double getStudentPercentage() {
		return this.studentPercentage;
	}
	
}
