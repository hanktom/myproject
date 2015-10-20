package com.tom.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class MySqlTester {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://j.snpy.org/java1?user=java1&password=jjaa989");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from parking");
			while(rs.next()){
				int id = rs.getInt("id");
				String carId = rs.getString("car_id");
				Date d = rs.getDate("ctime");
				int type = rs.getInt("type");
				System.out.println(id+"/"+carId+"/"+d+"/"+type);
			}
			stmt.close();
			conn.close();
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
