package com.tom.parking;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ParkingTester {

	public static void main(String[] args) {
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
		
		try {
			FileReader fr = new FileReader("parking-data.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			while(line!=null){
				System.out.println(line);
				String[] dd = line.split(",");
				System.out.println(dd[0]+"/"+dd[1]);
				
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
