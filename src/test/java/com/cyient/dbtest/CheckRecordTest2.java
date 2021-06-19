package com.cyient.dbtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CheckRecordTest2 {

	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/CyDB", "postgres", "123456");

		Statement s = conn.createStatement();

		ResultSet rs = s.executeQuery("SELECT * FROM company where age>25");
		
		System.out.println(rs.next());//move to 1st row
		System.out.println(rs.getString(3));
		System.out.println(rs.next()); // move to 2nd row
		System.out.println(rs.getString(2));
		System.out.println(rs.next());//move to 3 row
		System.out.println(rs.getString(2));
		
		
		System.out.println(rs.next());
		System.out.println(rs.next());
		System.out.println(rs.next());

	}

}
