package com.javalec.aop_xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		/* xml-based AOP (Aspect-Oriented Programming) 
		 * client -> proxy -> target
		 */
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");	/* common process */
		Student student = ctx.getBean("xmlStudent", Student.class);
		student.getStudentInfo();	/* core process */
		
		Worker worker = ctx.getBean("xmlWorker", Worker.class);
		worker.getWorkerInfo();	/* core process */
		
		ctx.close();

	}

}
