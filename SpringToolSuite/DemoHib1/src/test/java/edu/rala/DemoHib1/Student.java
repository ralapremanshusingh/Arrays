package edu.rala.DemoHib1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	private int studentId;
	private String studentName;
	private int StudentAge;
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public int getStudentAge() {
		return StudentAge;
	}
	public void setStudentAge(int studentAge) {
		StudentAge = studentAge;
	}
	

}
