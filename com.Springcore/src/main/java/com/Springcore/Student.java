package com.Springcore;

public class Student 
{
	private int  studentRoll;
	private String studentName;
	private String studentAddress;
	
	
	public int getStudentRoll()
	{
		return studentRoll;
	}
	public void setStudentRoll(int studentRoll)
	{
		this.studentRoll = studentRoll;
	}
	public String getStudentName() 
	{
		return studentName;
	}
	public void setStudentName(String studentName)
	{
		this.studentName = studentName;
	}
	public String getStudentAddress()
	{
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress)
	{
		this.studentAddress = studentAddress;
	}
	public Student(int studentRoll, String studentName, String studentAddress)
	{
		super();
		this.studentRoll = studentRoll;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	
	public Student() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() 
	{
		return "Student [studentRoll=" + studentRoll + ", studentName=" + studentName + ", studentAddress="
				+ studentAddress + "]";
	}
	
	
	
	
	
	

}
