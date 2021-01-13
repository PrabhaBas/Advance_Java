package com.prabha.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.prabha.web.model.Rough;


public class RoughDao 
{
	String url="jdbc:mysql://localhost:3306/itech";
	String query="select * from employee where id=?";
	public Rough getRough(int eid)
	{
	Rough r = new Rough();
	try {
		Class.forName("com.mysql.jdbc.Driver");	
		Connection con = DriverManager.getConnection(url,"root","1112000");
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1,eid);
		ResultSet rs = ps.executeQuery();
		if(rs.next())
		{
			r.setEid(rs.getInt("id"));
			r.setEname(rs.getString("name"));		
			r.setEage(rs.getInt("age"));		
		}
	} catch (Exception e) {
	System.out.println(e);	
	}
	return r;
	}
	
	

}
