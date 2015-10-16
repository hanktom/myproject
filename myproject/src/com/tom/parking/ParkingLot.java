package com.tom.parking;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ParkingLot {
	int rate = 30;
	Map<String, Date> map = new HashMap<>();
	public void add(Car c){
		
	}
	
	public int remove(Car c){
		
		return 0;
	}
	
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("parking-data2.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			while(line!=null){
				System.out.println(line);
				
				new Scanner(System.in).nextLine();
				line = in.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}	
}
