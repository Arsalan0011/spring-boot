package com.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.annotation.*;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		/// setter injection
		Student st=context.getBean("std",Student.class);
		st.dispStudentInfo();
		
		

	}

}
