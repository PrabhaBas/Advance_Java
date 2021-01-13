package com.loginmodule.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	String url = "jdbc:mysql://localhost:3306/demo";
	String query =" select * from registration where user=? and pass=?";
	public boolean check(String uname,String pass)
	{	
		try 
		{		
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,"root","1112000");
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1,uname);
			st.setString(2,pass);
			ResultSet rs = st.executeQuery();
			
			boolean rscheck = rs.next();
			System.out.println("rs ="+rscheck);
			if(rscheck==true)
			{
				System.out.println("rs check enter");
				return true;		
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
