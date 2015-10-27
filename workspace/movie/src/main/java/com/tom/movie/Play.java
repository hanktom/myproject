package com.tom.movie;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Play {
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
	
	int id;
	int movieId;
	Date time;
	public Play(int id, int movieId, Date time) {
		super();
		this.id = id;
		this.movieId = movieId;
		this.time = time;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
	
}
