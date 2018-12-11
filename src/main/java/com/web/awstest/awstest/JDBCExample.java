package com.web.awstest.awstest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {

	// JDBC driver name and database URL

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";

	static final String DB_URL = "jdbc:mysql://mysql-instance1.cxrunycu6d8w.us-east-2.rds.amazonaws.com/root";

	// Database credentials

	static final String USER = "root";

	static final String PASS = "rootroot";

	public static void main(String[] args) {

	  //DriverManager
		Connection conn = null;

		Statement stmt = null;
		
		ResultSet rs = null;

		try {

			// STEP 2: Register JDBC driver

			Class.forName("com.mysql.jdbc.Driver");

			// STEP 3: Open a connection

			System.out.println("Connecting to a selected database...");

			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			System.out.println("Connected database successfully...");

			// STEP 4: Execute a query

			System.out.println("Creating statement...");

			stmt = conn.createStatement();

			String sql = "SELECT id FROM bmi";

			 rs = stmt.executeQuery(sql);

			// STEP 5: Extract data from result set

			while (rs.next()) {

				//
				// Retrieve by column name

				int id = rs.getInt("id");

				// Display values

				System.out.print("ID: " + id);

			}

			rs.close();

		} catch (SQLException se) {

			// Handle errors for JDBC

			se.printStackTrace();

		} catch (Exception e) {

			// Handle errors for Class.forName

			e.printStackTrace();

		} finally {

			// finally block used to close resources

			try {

				if (stmt != null)

					conn.close();

			} catch (SQLException se) {
			} // do nothing

			try {

				if (conn != null)

					conn.close();

			} catch (SQLException se) {

				se.printStackTrace();

			} // end finally try

		} // end try

		System.out.println("Goodbye!");

	}// end main

}// end JDBCExample
