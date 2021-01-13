package com.loginmodule.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RegistrationDao {

	public boolean check(String uname,String mail,long phone,String pass,String cpass)
	{
		
		
		String url= "jdbc:mysql://localhost:3306/demo";
		String query="insert into registration(user,mail,phoneno,pass,confirmpass)values(?,?,?,?,?);";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,"root","1112000");;
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1,uname);
			ps.setString(2,mail);
			ps.setLong(3,phone);
			ps.setString(4,pass);
			ps.setString(5,cpass);
			
			int count= ps.executeUpdate();
			if(count>0)
			{
				return true;
			}
			
		} catch (Exception e) {		
			e.printStackTrace();
		}
		
		
		
		return false;
	}
	
}
