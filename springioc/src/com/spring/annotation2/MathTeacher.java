package com.spring.annotation2;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher {

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("Hi i am math teacher and my name is Muddassir");

	}

}
