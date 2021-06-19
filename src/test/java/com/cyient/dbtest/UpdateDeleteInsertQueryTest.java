package com.cyient.dbtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDeleteInsertQueryTest {

	public static void main(String[] args) throws SQLException {

		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/CyDB", "postgres", "123456");

		Statement s = conn.createStatement();

		s.execute("UPDATE company SET salary=12000 WHERE id=4");
		
		
		
	}
}