package com.tom.movie;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
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
	
	public List<Play> listPlays(){
		List<Play> plays = new ArrayList<Play>();
		Connection conn = DBUtil.getConnection();
		try {
			PreparedStatement pstmt = conn.prepareStatement("select * from plays where movie_id=?");
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			int i=1;
			while(rs.next()){
				int id = rs.getInt("id");
				int movieId = rs.getInt("movie_id");
				Date time = rs.getTimestamp("time");
				Play p = new Play(id, movieId, time);
				plays.add(p);
				System.out.println(i+". "+Play.sdf.format(p.getTime()));
				i++;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return plays;
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
				String intro = rs.getString("intro");
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
