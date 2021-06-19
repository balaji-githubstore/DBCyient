package com.cyient.dbtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CountTest {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/CyDB", "postgres", "123456");

		Statement s = conn.createStatement();

		ResultSet rs = s.executeQuery("SELECT count(*) FROM company where age>25");
		
		while(rs.next())
		{
			String c = rs.getString(1);
			System.out.println(c);
			System.out.println("-----------------------");
		}
		
	}

}
