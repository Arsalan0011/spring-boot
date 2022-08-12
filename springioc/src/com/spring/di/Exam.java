package com.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		/// setter injection
		Student st=context.getBean("student",Student.class);
		st.display();
		st.callingMathCheat();
		
		// construction injection
		Student asad=context.getBean("Asad",Student.class);
		asad.display();
		
	
		
	}

}
