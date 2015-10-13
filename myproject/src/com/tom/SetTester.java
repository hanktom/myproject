package com.tom;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTester {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(9);
		set.add(5);
		set.add(3);
		set.add(8);
		set.add(1);
		set.add(3);
		for(int n: set){
			System.out.println("#"+n);
		}
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()){
			System.out.println("*"+it.next());
		}
		
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.contains(3));
		set.remove(1);
		System.out.println(set);
	}

}
