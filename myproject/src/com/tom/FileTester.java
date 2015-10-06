package com.tom;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTester {

	public static void main(String[] args) {
//		writeTest();
//		readTest1();
//		readTest2();
		try {
			FileReader fr = new FileReader("data.txt");
			BufferedReader in = new BufferedReader(fr);
			String s = in.readLine();
			while(s!=null){
				System.out.println(s);
				s = in.readLine();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	private static void readTest2() {
		try {
			FileReader in = new FileReader("data.txt");
			char[] buf = new char[255];
			int len = in.read(buf);
			System.out.println(len);
			String s = new String(buf, 0, len);
			System.out.println(s);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void readTest1() {
		try {
			FileReader in = new FileReader("data.txt");
			int n = in.read();
			while(n!= -1){
				System.out.println(n);
				n = in.read();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void writeTest() {
		try {
			FileWriter out = new FileWriter("data.txt");
			out.write("ABC測試");
			out.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
