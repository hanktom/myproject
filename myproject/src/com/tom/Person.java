package com.tom;

import java.util.Scanner;

public class Person {
	float weight;
	float height;
	public Person(float w, float h){
		weight = w;
		height = h;
	}

	public float bmi(){
		float bmi = weight/(height*height);
		return bmi;
	}
	
	public void sayHello(){
		System.out.println("Hello World");
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入姓名:");
		String s = scanner.nextLine();
		System.out.println(s+"您好");
		
		System.out.print("請輸入體重:");
//		String s2 = scanner.nextLine();
//		float w = Float.parseFloat(s2);
		float w = scanner.nextFloat();
		
		System.out.print("請輸入身高(公尺):");
		String s3 = scanner.nextLine();
		float h = Float.parseFloat(s3);
		
		Person p = new Person(w, h);
		System.out.println(p.bmi());
		
		
		
		
		/*
		Person p = new Person(65.5f, 1.7f);
		System.out.println(p.bmi());
//		p.sayHello();
//		p.weight = 65.5f;
//		p.height = 1.7f;
		
		float w = 65.5f;
		float h = 1.7f;
		float bmi = w/(h*h);
		System.out.println(bmi);
		*/
	}
}
