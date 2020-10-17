package com.sj.DBconnector;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Dbconnector {
	
		 static Connection con;
	
		public static Connection getConnection() throws SQLException,ClassNotFoundException{
			try {
	
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
				
	    String url ="jdbc:mysql://localhost:3306/hari";
	    String user = "root";
	    String password = "1234";
	    con = DriverManager.getConnection(url, user, password);
	    System.out.println("completed");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	    
		return con;
		}
	
	}

	
	

	
