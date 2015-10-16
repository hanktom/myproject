package com.tom.parking;

import java.text.SimpleDateFormat;

public class Car {
	static SimpleDateFormat sdf = new SimpleDateFormat("HHmm");
	String id;
	String enter;
	String leave;
	public Car(String id, String enter) {
		super();
		this.id = id;
		this.enter = enter;
	}
	
}
