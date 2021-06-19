package com.cyient.dbtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBSelectTest {

	public static void main(String[] args) throws SQLException {

		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/CyDB", "postgres", "123456");

		Statement s = conn.createStatement();

		ResultSet rs = s.executeQuery("SELECT * FROM company");
		
		while(rs.next())
		{
			String id = rs.getString(1);
			System.out.println(id);
			String name = rs.getString(2);
			System.out.println(name);
			String age = rs.getString(3);
			System.out.println(age);
			String add = rs.getString(4);
			System.out.println(add);
			String sal = rs.getString(5);
			System.out.println(sal);
			System.out.println("-----------------------");
		}
	}
}
