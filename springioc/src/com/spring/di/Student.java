package com.spring.di;

public class Student {
		private int studentId;
		private String studentName;
		
		private MathCheat mathCheat;
		
		
		
		
		public Student(int studentId, String studentName) {
			this.studentId = studentId;
			this.studentName = studentName;
		}

		public void display() {
			System.out.println("Student Id  is : "+  studentId + " and  name is " + studentName);
			
		}
		
		public void callingMathCheat() {
			mathCheat.mathCheat();
		}
		
		


		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}

		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}

		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}

	

		public void setMathCheat(MathCheat mathCheat) {
			this.mathCheat = mathCheat;
		}
		
		
		
		

}
