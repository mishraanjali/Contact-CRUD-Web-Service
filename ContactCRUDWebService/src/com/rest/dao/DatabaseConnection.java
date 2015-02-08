package com.rest.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	
public Connection getConnection() throws Exception{
		
		try{
			String db_url = "jdbc:mysql://localhost:3306/contact_db";
			Connection con = null;
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con = DriverManager.getConnection(db_url, "root", "java");
			return con;
		}
		catch(Exception e){
			throw e;
		}
	
	}

}
