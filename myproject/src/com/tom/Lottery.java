package com.tom;

import java.util.Random;

public class Lottery {
	int[] nums = new int[5];
	
	public Lottery(){
		
	}
	
	public Lottery(int n1, int n2, int n3, int n4, int n5){
		nums[0] = n1;
		nums[1] = n2;
		nums[2] = n3;
		nums[3] = n4;
		nums[4] = n5;
	}
	
	public Lottery(int[] numbers){
		nums = numbers;
	}
	
	public boolean validate(){
		boolean valid = false;
		int[] data = new int[40];
		int count = 0;
		for (int i=0; i<5; i++){
			if (data[nums[i]]==0){
				data[nums[i]] = 1;
				count = count +1;
			}
		}
		if (count==5)
			valid = true;
		
		return valid;
	}
	
	public void generate(){
		Random r = new Random();
		for (int i=0; i<5; i++){
			nums[i] = r.nextInt(39)+1;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
//		Lottery lot = new Lottery(1, 3, 7, 8, 9);
		Lottery lot = new Lottery(1, 3, 7, 7, 9);
		System.out.println(lot.validate());
		
		/*
		Random r = new Random();
		int[] n = new int[5];
		for (int i=0; i<5; i++){
			n[i] = r.nextInt(39)+1;
			System.out.println(n[i]);
		}
		*/
	}

}
