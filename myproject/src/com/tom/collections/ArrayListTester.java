package com.tom.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTester {

	public static void main(String[] args) {
		// int[] nums = new int[5];
//		ArrayList<Integer> list2 = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		list.add(6);
		list.add(3);
		list.add(8);
		list.add(1);
		list.add(8);
		list.add(3);
		for (int i=0; i<list.size(); i++){
			System.out.println("*"+list.get(i));
		}
		for (int n : list){
			System.out.println("#"+n);
		}
		
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.contains(8));
		list.remove(2);
		System.out.println(list.contains(8));
		System.out.println(list.size());
		System.out.println(list.get(1));
		list.clear();
		System.out.println(list.size());
		System.out.println(list.get(1));
	}

}
