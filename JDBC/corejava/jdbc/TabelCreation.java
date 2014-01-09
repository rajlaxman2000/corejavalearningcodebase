package corejava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//import java.sql.*;
//http://www.mkyong.com/tutorials/jdbc-tutorials/
public class TabelCreation {
	private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/hostellatestgeetha";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "";
 
	public static void main(String[] argv) { 
		
		try { 
			createDbUserTable();
 
		} catch (SQLException e) {
 
			System.out.println(e.getMessage());
 
		}
 
	}
 
	private static void createDbUserTable() throws SQLException {
 
		Connection dbConnection = null;
		Statement statement = null;
 /*
		String createTableSQL = "CREATE TABLE `hostel_duplicate` (" +
				"`hostel_id` int(11) NOT NULL AUTO_INCREMENT, `hostel_name` varchar(45) DEFAULT NULL, `hostel_street` varchar(30) NOT NULL," +
				"`hostel_city` varchar(20) DEFAULT NULL, `hostel_state` varchar(20) DEFAULT NULL,`hostel_postal_code` int(20) DEFAULT NULL," +
				"`hostel_country` varchar(45) DEFAULT NULL, `hostel_phone` varchar(20) DEFAULT NULL,`hostel_email` varchar(40) DEFAULT NULL," +
				"`hostel_facebook` varchar(40) DEFAULT NULL,`hostel_web` varchar(30) DEFAULT NULL,`hostel_checkIn_time` varchar(11) DEFAULT NULL," +
				"`hostel_checkOut_time` varchar(11) DEFAULT NULL,`smoking` varchar(4) DEFAULT NULL,`alcohol` varchar(4) DEFAULT NULL," +
				"`cancellation_hours_limit` int(11) DEFAULT NULL,`cancellation_fee_percant` int(11) DEFAULT NULL,`created_date` date DEFAULT NULL," +
				" PRIMARY KEY (`hostel_id`))";
	*/
		
		String createTableSQL = "CREATE TABLE `hostel_duplicate` " +
				"(`hostel_id` int(11) NOT NULL AUTO_INCREMENT, `hostel_name` varchar(45) DEFAULT NULL, `hostel_street` varchar(30) NOT NULL," +
		"`hostel_city` varchar(20) DEFAULT NULL, `hostel_state` varchar(20) DEFAULT NULL,`hostel_postal_code` int(20) DEFAULT NULL," +
		"`hostel_country` varchar(45) DEFAULT NULL, `hostel_phone` varchar(20) DEFAULT NULL,`hostel_email` varchar(40) DEFAULT NULL," +
		"`hostel_facebook` varchar(40) DEFAULT NULL,`hostel_web` varchar(30) DEFAULT NULL,`hostel_checkIn_time` varchar(11) DEFAULT NULL," +
		"`hostel_checkOut_time` varchar(11) DEFAULT NULL,`smoking` varchar(4) DEFAULT NULL,`alcohol` varchar(4) DEFAULT NULL," +
		"`cancellation_hours_limit` int(11) DEFAULT NULL,`cancellation_fee_percant` int(11) DEFAULT NULL,`created_date` date DEFAULT NULL," +
		" PRIMARY KEY (`hostel_id`))";
		
		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			
			
 
			System.out.println(createTableSQL);
                        // execute the SQL stetement
			statement.execute(createTableSQL);
 
			System.out.println("Table \"dbuser\" is created!");
 
		} catch (SQLException e) {
 
			System.out.println(e.getMessage());
 
		} finally {
 
			if (statement != null) {
				statement.close();
			}
 
			if (dbConnection != null) {
				dbConnection.close();
			}
 
		}
 
	}
 
	private static Connection getDBConnection() {
 
		Connection dbConnection = null;
 
		try {
 
			Class.forName(DB_DRIVER);
 
		} catch (ClassNotFoundException e) {
 
			System.out.println(e.getMessage());
 
		}
 
		try {
 
			dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER,DB_PASSWORD);
			return dbConnection;
 
		} catch (SQLException e) {
 
			System.out.println(e.getMessage());
 
		}
 
		return dbConnection;
 
	}
 
}