package com.antra;

public class Student {
	
	private int studentId;
	private int marks;
	private String name;
	
	public Student() {
		//System.out.println("in constructor");
	}
	
	/*static{
		
		System.out.println("in static block");
	}
	
	{
		System.out.println("in instance block");
	}*/
	public Student(int studentId,int marks,String name) {
		
		this.studentId=studentId;
		this.name=name;
		this.marks=marks;
		System.out.println("in constructor");
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

	
}
