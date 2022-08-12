package com.spring.annotation2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ApplicationContext context= new ClassPathXmlApplicationContext("beans2.xml");
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(CollegeConfig.class);
		College collegeObj=context.getBean("collegeBean",College.class);
		collegeObj.test(); 
		context.close();
		
		
		

	} 

}
