package com.spring.annotation2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("collegeBean")
public class College {
	@Value("${college.collegeName}") 
	private String collegeName;
	 
	 @Autowired
	private Principal principal;
	 @Autowired
	 @Qualifier("mathTeacher")
	private Teacher teacherObj;


//	public College(Principal principal) {
//		super();
//		this.principal = principal;
//	}
//	
	
	

	public College() {
		// TODO Auto-generated constructor stub
	}



//	
//	public void setTeacher(Teacher teacher) {
//		this.teacher = teacher;
//	}
//
//
//
//
//	public void setPrincipal(Principal principal) {
//		this.principal = principal;
//	}




	public void test() {
		System.out.println("testing the test method");
		System.out.println("My college name is : "+ collegeName);
		principal.dispInfo();
		teacherObj.teach();
	}

}
