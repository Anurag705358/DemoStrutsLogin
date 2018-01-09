package com.anu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class RegisterDao {

	public static int save(RegisterAction r) {
		int status = 0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

			Statement stmt = con.createStatement();
			status = stmt.executeUpdate("insert into User values('" + r.getName() + "','" + r.getPassword() + "','"
					+ r.getEmail() + "','" + r.getGender() + "')");

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
}
