package com.tom.movie;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
	
	public List<Integer> reserve(int numOfTicket){
		List<Integer> seats = new ArrayList<Integer>();
		Connection conn = DBUtil.getConnection();
		try {
			PreparedStatement pstmt = conn.prepareStatement("select * from seats "
					+ "where play_id=?");
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			rs.afterLast();
			int lastSeat = 1;
			if (rs.previous()){
				int seatId = rs.getInt("seat_no");
				lastSeat = seatId+1;
			}
			for (int i=0; i<numOfTicket; i++){
				PreparedStatement pstmt2 = conn.prepareStatement(
						 "insert into seats(play_id, seat_no, status) "
						 + "values(?,?,?)");
				pstmt2.setInt(1, id);
				pstmt2.setInt(2, lastSeat+i);
				pstmt2.setInt(3, 1);
				int rowCount = pstmt2.executeUpdate();
				if (rowCount>0)
					seats.add(lastSeat+i);
			}
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return seats;
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
