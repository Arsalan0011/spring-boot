package com.spring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
		@Autowired
		private Heart heart;
		
	
//		@Autowired
//		public Human(Heart heart) {
//			super();
//			System.out.println("Human constructor called");
//			
//			this.heart = heart;
//		}

		public void startPumping(){
			
			heart.pumping();
			
		}
//		@Autowired
//		public void setHeart(Heart heart) {
//			this.heart = heart;
//		}


		
		

}
