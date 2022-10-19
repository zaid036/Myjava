package com.Bank;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public final class MyConnection {

		public static Connection myConnection()
		{
			Connection con=null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con =DriverManager.getConnection("jdbc:mysql://localhost:3306/employees","root","root");
			    
			
			}
					catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			 catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return con; 
		}
		
	}


