package com.javalec.aop_xml;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {
	 
	//common process (a proxy) 
	//loggerAop takes the parameter joinPoint which are core processes (method execution)
	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable {
		
		/*
		 Join point: "It is a candidate point in the Program Execution of the
		 application where an aspect can be plugged in.
		 such as method call, method returning normally, method throwing an exception, instantiating an object, referring an object, etc."
		 more info at https://stackoverflow.com/questions/15447397/spring-aop-whats-the-difference-between-joinpoint-and-pointcut
		 */
		
		
		//the method loggerAop is not directly involved in actual environments such as Student.java and Worker.java
		//let's output a method name
		String signatureStr = joinPoint.getSignature().toShortString();		/* in common process */
		System.out.println();
		System.out.println(signatureStr + " is started");
		long startTime = System.currentTimeMillis();	//a start time	/* still in common process */
		
		try {
			Object obj = joinPoint.proceed();	//proceed joinPoint; a target	/* in core process */
			return obj;
			
		} finally {
			long endTime = System.currentTimeMillis();	//an end time	/* back in common process */
			System.out.println(signatureStr + " is finished");
			System.out.println(signatureStr + " elapsed time: " + (endTime - startTime));
			
			
		}
		
	}

}
