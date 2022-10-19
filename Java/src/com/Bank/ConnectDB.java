package com.Bank;

	import java.sql.*;
	public class ConnectDB {

		public static void main(String[] args) {

	 try {
		Class.forName("com.mysql.jdbc.Driver");
		
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/employees","root","root");
		    Statement stmt=con.createStatement();
		    ResultSet rs=stmt.executeQuery("select * from employee1");
			
		    while(rs.next())
		    {
		    	System.out.println(rs.getInt(1) +" "+rs.getString(2)+" "+rs.getString(2));
		    }
			
		    con.close();
		}
	 catch (SQLException e) {
			
			e.printStackTrace();
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}

		}

	}


