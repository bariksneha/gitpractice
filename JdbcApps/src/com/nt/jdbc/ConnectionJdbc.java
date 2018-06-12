package com.nt.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJdbc {
	public static void main(String[] args) {
		Connection con=null;
		try {
		//register the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//establish the connection
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		if(con!=null)
			System.out.println("connection established");
		else
			System.out.println("connection is not established");
		}
		catch(SQLException se){
			se.printStackTrace();
		}
		catch(ClassNotFoundException ce) {
			ce.printStackTrace();
			
		}
		finally {
			try {
				if(con!=null)
					con.close();
			}
			catch(Exception e){
				e.printStackTrace();
				
			}
		}
		
		
	}//main()

}//class
