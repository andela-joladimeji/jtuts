package com.andela.tutorials;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgresJDBC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(
					"jdbc:postgresql://127.0.0.1:5432/jtuts", "postgres",
					"postgres");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Connection to database server stablished");

		Statement statement = null;
		try {
			statement = connection.createStatement();
			ResultSet resutlSet = statement
					.executeQuery("SELECT * FROM settings");

			if (resutlSet.next()) {
				System.out.println("Version => " + resutlSet.getString(1));
				System.out.println("Owner   => " + resutlSet.getString(2));
			}

			ResultSet userResult = statement
					.executeQuery("SELECT * FROM users");
			while (userResult.next()) {
				System.out.println("ID:" + userResult.getString(1));
				System.out.println("Company:" + userResult.getString(2));
				System.out.println("Email" + userResult.getString(3));
				System.out.println("Full Name" + userResult.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
