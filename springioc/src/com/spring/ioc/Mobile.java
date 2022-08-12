package com.spring.ioc;
import org.springframework.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		
		Sim sim =(Sim) context.getBean("sim");
		sim.calling();
		sim.data();

	}

}
