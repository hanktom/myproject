package com.tom.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Car {
	static SimpleDateFormat sdf = new SimpleDateFormat("HHmm");
	String id;
	String enter;
	Date enterTime;
	
	
	
	public Car(String id, Date enterTime) {
		super();
		this.id = id;
		this.enterTime = enterTime;
	}
	public Car(String id, String enter) {
		super();
		this.id = id;
		this.enter = enter;
	}
	public Car(String id) {
		super();
		this.id = id;
	}
	
	public int leave(String leave){
		int mins = 0;
		try {
			Calendar c = Calendar.getInstance();
			c.setTime(sdf.parse(enter));
			Date d0 = sdf.parse(enter);
			Date d1 = sdf.parse(leave);
			mins = (int)((d1.getTime()-d0.getTime())/(60*1000));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mins;
		
	}
	
	public int leave(Date leaveTime){
		int mins = (int)((leaveTime.getTime()-enterTime.getTime())/(60*1000));
		return mins;
	}
	
}
