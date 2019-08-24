package com.javalec.aop_xml;

public class Worker {

	private String name, job;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getJob() {
		return job;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void getWorkerInfo() {
		
		System.out.println("name: " + getName());
		System.out.println("age: " + getAge());
		System.out.println("job: " + getJob());
	}
}
