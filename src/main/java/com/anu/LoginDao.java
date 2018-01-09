package com.anu;


import java.sql.*;





public class LoginDao {

	public static boolean validate(String uname,String upass){
		boolean status=false;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

			PreparedStatement ps= con.prepareStatement("select * from User where Name=? and password=?");
			  ps.setString(1,uname);  
			   ps.setString(2,upass);  
			   ResultSet rs=  ps.executeQuery();  
			   status=rs.next();  
			   con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		
		return status;
		
	}
	
	
}
