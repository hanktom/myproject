package com.tom;

public class GraduateStudent extends Student {

	int thesis;
	static int pass = 70;
	
	public GraduateStudent(int english, int chinese, int math, int thesis) {
		super(english, chinese, math);
		this.thesis = thesis;
		
	}

	@Override
	public void report() {
		String star = "";
		if (average()<pass){
			star = "*";
		}
		System.out.println(english+"\t"+chinese+"\t"+math+"\t"+average()+star+"\t"+thesis);
	}

	
}
