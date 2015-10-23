package com.to.thread;

public class Horse extends Thread {

	@Override
	public void run() {
		for (int i=0;i<=5000;i++){
			System.out.println(getName()+":"+i);
		}
	}
	
}
