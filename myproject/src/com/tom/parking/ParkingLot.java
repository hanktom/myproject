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
import java.util.StringTokenizer;

public class ParkingLot {
	int rate = 30;
	Map<String, Car> map = new HashMap<>();
	public void add(Car c){
		map.put(c.id, c);
	}
	
	public int remove(String id, Date leaveTime){
		if (map.containsKey(id)){
			Car c = map.get(id);
			int mins = c.leave(leaveTime);
			return (int)Math.ceil(mins/60.0)*rate;
		}
		return 0;
	}
	
	public int remove(String id, String leave){
		if (map.containsKey(id)){
			Car c = map.get(id);
			int mins = c.leave(leave);
			return (int)Math.ceil(mins/60.0)*rate;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		ParkingLot lot = new ParkingLot();
		try {
			FileReader fr = new FileReader("parking-data2.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			while(line!=null){
				System.out.println(line);
				String[] ss = line.split(",");
				String type = ss[0];
				String id = ss[2];
				String time = ss[1];
				if (type.equals("1")){
					int fee = lot.remove(id, time);
					System.out.println("fee:"+fee);
				}else{
					Car c = new Car(id, time);
					lot.add(c);
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
		} 
	}	
}
