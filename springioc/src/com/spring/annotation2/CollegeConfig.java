package com.spring.annotation2;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
 @ComponentScan(basePackages = "com.spring.annotation2")
@PropertySource("classpath:college-info.properties")
public class CollegeConfig {
	/*
	 * @Bean public Teacher mathTeacherBean() {
	 * 
	 * return new MathTeacher(); }
	 * 
	 * @Bean public Principal principalBean() { return new Principal(); }
	 * 
	 * @Bean(name = "collegeBean") public College collegeBean() { //collegeBean is
	 * our Bean Id (name of a method)
	 * 
	 * College college= new College(); college.setPrincipal(principalBean());
	 * college.setTeacher(mathTeacherBean()); return college; }
	 */
	


}
