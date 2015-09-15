package com.tom;

import java.util.Scanner;

public class Person {
	float weight;
	float height;
	float bmi;
	public Person(float w, float h){
		weight = w;
		height = h;
	}

	public float bmi(){
		bmi = weight/(height*height);
		return bmi; 
	}
	
	public void advice(){
		if (bmi < 18.5){
			System.out.println("該多吃點了");
		}else {
			if ( bmi>=18.5 && bmi<=24){
				System.out.println("正常");
			}else{
				System.out.println("要多運動了");
				
			}
			
		}
	}
	
	public void sayHello(){
		System.out.println("Hello World");
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入姓名:");
		String name = scanner.nextLine();
		System.out.println(name+"您好");
		System.out.print("請輸入體重:");
		float w = scanner.nextFloat();
		System.out.print("請輸入身高(公尺):");
		float h = scanner.nextFloat();
		
		Person p = new Person(w, h);
		System.out.println(p.bmi());
		p.advice();
		
		
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
