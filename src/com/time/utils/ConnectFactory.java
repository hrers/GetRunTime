package com.time.utils;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectFactory {
	

	public static Connection getConnection() {
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/time?useUnicode=true&characterEncoding=utf8";
			// 数据库用户名
			String username = "root";
			// 数据库密�?
			String password = "123456";
			// 创建Connection连接
			Connection conn = DriverManager.getConnection(url,username,password);
			if(conn != null)
				return conn;
			else
				return null;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	
	
	
}
