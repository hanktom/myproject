package com.tom;

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
		Person p = new Person(65.5f, 1.7f);
		System.out.println(p.bmi());
//		p.sayHello();
//		p.weight = 65.5f;
//		p.height = 1.7f;
		
		float w = 65.5f;
		float h = 1.7f;
		float bmi = w/(h*h);
		System.out.println(bmi);
	}
}
