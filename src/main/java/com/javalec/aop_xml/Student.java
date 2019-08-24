package com.javalec.aop_xml;

//a core process
public class Student {
	
	private String name;
	private int age, grade, classNum;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public int getClassNum() {
		return classNum;
	}
	
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	
	//this is the core function (process)
	/* How around works is common process -> corfe process -> common process in LogAop class  	  
	   common process: long startTime = System.currentTimeMillis(); 
	   core process: Object obj = joinPoint.proceed(); which is getStudentInfo()   
	   common process: long endTime = System.currentTimeMillis(); */
	public void getStudentInfo() {
		
		System.out.println("name: " + getName());
		System.out.println("age: " + getAge());
		System.out.println("grade: " + getGrade());
		System.out.println("class: " + getClassNum());
		
	}

	
}
