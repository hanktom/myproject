package com.tom;

public class Student {
	int english;
	int chinese;
	int math;
	static int pass = 60;
	public Student(int english, int chinese, int math){
		this.english = english;
		this.chinese = chinese;
		this.math = math;
	}
	
	public float average(){
		float avg = (english+chinese+math)/3;
		return avg;
	}
	
	public void report(){
		String star = "";
		if (average()<pass){
			star = "*";
		}
		System.out.println(english+"\t"+chinese+"\t"+math+"\t"+average()+star);
	}
	
	public static void main(String[] args) {
		Student stu1 = new Student(66, 77, 88);
		Student stu2 = new Student(68, 33, 51);
		Student stu3 = new Student(90, 94, 97);
		System.out.println(stu1.pass);
		Student.pass = 55;
//		stu1.pass
		System.out.println(stu1.pass);
		System.out.println(stu2.pass);
//		stu1.report();
//		stu2.report();
//		stu3.report();
		
//		System.out.println(stu.average());
	}
}
