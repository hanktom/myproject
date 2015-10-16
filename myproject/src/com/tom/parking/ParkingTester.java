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

public class ParkingTester {

	public static void main(String[] args) {
		System.out.println(Math.ceil(2.01f));
		Date d = new Date();
		System.out.println(d);
		
		
		String s1 = "0810";
		SimpleDateFormat sdf = new SimpleDateFormat("HHmm");
		Date d1;
		try {
			d1 = sdf.parse(s1);
			System.out.println(d1);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Map<String, Date> map = new HashMap<>();
		try {
			FileReader fr = new FileReader("parking-data.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			while(line!=null){
				System.out.println(line);
				String[] dd = line.split(",");
				System.out.println(dd[0]+"/"+dd[1]);
				String time = dd[0];
				String carId = dd[1];
				if(map.containsKey(carId)){
					//出場
					Date enter = map.get(carId);
					Date out = sdf.parse(time);
					long t = out.getTime()-enter.getTime();
					System.out.println(t);
					long minutes = t/(1000*60);
					System.out.println(minutes);
					double fee = Math.ceil(((int)minutes/60f))*30;
					System.out.println(fee);
					
				}else{
					//進場
					map.put(carId, sdf.parse(time));
				}
				
				
				new Scanner(System.in).nextLine();
				line = in.readLine();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
