package com.tom.movie;

public class Movie {
	int id;
	String name;
	String cast;
	int rate;
	String intro;
	int duration;
	public Movie(int id, String name, String cast, int rate, String intro, int duration) {
		super();
		this.id = id;
		this.name = name;
		this.cast = cast;
		this.rate = rate;
		this.intro = intro;
		this.duration = duration;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCast() {
		return cast;
	}
	public void setCast(String cast) {
		this.cast = cast;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
}
