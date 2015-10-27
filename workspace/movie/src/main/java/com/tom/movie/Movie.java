package com.tom.movie;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
	
	public static List<Movie> getAllMovies(){
		List<Movie> movies = new ArrayList<Movie>();
		Connection conn = DBUtil.getConnection();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from movies");
			while(rs.next()){
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String cast = rs.getString("cast");
				int rate = rs.getInt("rate");
				String intro = rs.getString("instro");
				int duration = rs.getInt("duration");
				Movie m = new Movie(id, name, cast, rate, intro, duration);
				movies.add(m);
			}
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return movies;
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
