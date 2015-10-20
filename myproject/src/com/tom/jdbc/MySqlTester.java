package com.tom.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Date;

import com.tom.parking.Car;
import com.tom.parking.ParkingLot;

public class MySqlTester {

	public static void main(String[] args) {
		ParkingLot lot = new ParkingLot();
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://j.snpy.org/java1?user=java1&password=jjaa989");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from parking");
			while(rs.next()){
				int id = rs.getInt("id");
				String carId = rs.getString("car_id");
				Timestamp ts = rs.getTimestamp("ctime");
				Date d = new Date(ts.getTime());
				int type = rs.getInt("type");
				System.out.println(id+"/"+carId+"/"+d+"/"+type);
				Car c = new Car(carId, d);
				if (type==0){
					lot.add(c);
				}else{
					int fee = lot.remove(carId, d);
					System.out.println("fee:"+fee);
				}
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
