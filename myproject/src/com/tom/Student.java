package com.tom;

public class Student {
	int english;
	int chinese;
	int math;
	public Student(int eng, int chi, int m){
		english = eng;
		chinese = chi;
		math = m;
	}
	
	public float average(){
		float avg = (english+chinese+math)/3;
		return avg;
	}
	
	
	public static void main(String[] args) {
		Student stu = new Student(66, 77, 88);
		System.out.println(stu.average());
	}
}
