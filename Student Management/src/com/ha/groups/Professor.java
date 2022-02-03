package com.ha.groups;

import com.ha.base.Person;

public class Professor extends Person {
	
	private String professorId;
	private String departmentId;
	private String departmentName;
	private double experience;

	// Setter
	public void setProfessorId(String professorId) {
		this.professorId = professorId;
	}
	
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public void Experience(double experience) {
		this.experience = experience;
	}
	
	// Getter
	public String getProfessorId() 	{
		return this.professorId;
	}
	
	public String getdepartmentId() {
		return this.departmentId;
	}
	
	public String getDepartmentName() {
		return this.departmentName;
	}
	
	public double getexperience() {
		return this.experience;
	}

	
}
