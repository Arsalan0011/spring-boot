package com.spring.annotation;


import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	
	
	private String name;
	
	
	@Value("${std.interestedCourse}")
	private String interestedCourse;
	
	@Value("cricket")		
	private String hobby;
	
	public void dispStudentInfo() {
		System.out.println(name+interestedCourse+hobby);
	}

	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
//
//	public String getInterestedCourse() {
//		return interestedCourse;
//	}
//	
//	@Required
//	@Value("${std.interestedCourse}")
//	public void setInterestedCourse(String interestedCourse) {
//		this.interestedCourse = interestedCourse;
//	}
//
//	public String getHobby() {
//		return hobby;
//	}
//	@Value("cricket")
//	public void setHobby(String hobby) {
//		this.hobby = hobby;
//	}
//	
	
	

}
