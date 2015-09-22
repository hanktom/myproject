package com.tom;

import java.util.Random;

public class Lottery539Game{
	int[] numbers = new int[5];
	
	public Lottery539Game(){
		
	}
	
	public Lottery539Game(int n1, int n2, int n3, int n4, int n5){
		numbers[0] = n1;
		numbers[1] = n2;
		numbers[2] = n3;
		numbers[3] = n4;
		numbers[4] = n5;
	}
	
	public Lottery539Game(int[] numbers){
		this.numbers = numbers;
	}
	
	public boolean validate(){
		boolean valid = false;
		int[] data = new int[40];
		int count = 0;
		for (int i=0; i<5; i++){
			if (data[numbers[i]]==0){
				data[numbers[i]] = 1;
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
			numbers[i] = r.nextInt(39)+1;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
//		Lottery lot = new Lottery(1, 3, 7, 8, 9);
		Lottery539Game lot = new Lottery539Game(1, 3, 7, 7, 9);
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
