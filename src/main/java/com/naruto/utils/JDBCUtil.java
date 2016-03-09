package com.naruto.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtil {
	
	public static void main(String[] args) {
		Properties p = PropertiesUtil.readProperties("jdbc.properties");
		Connection conn = getConnection(p);
		try {
			PreparedStatement stat = conn.prepareStatement("select * from t_user where 1 = 1 and name = ?");
			stat.setString(1, "yuanyue");
			ResultSet rs = stat.executeQuery();
			
			while(rs.next()) {
				String name = rs.getString("name");
				System.out.println(name);
				System.out.println(DateUtil.timestampToString(rs.getTimestamp("date")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection(Properties p) {
		Connection conn = null;
		try {
			Class.forName(p.getProperty("jdbc.driver"));
			try {
				String url = p.getProperty("jdbc.url");
				String user = p.getProperty("jdbc.username");
				String password = p.getProperty("jdbc.password");
				conn = DriverManager.getConnection(url, user, password);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			
		}
		
		return conn;
	}

}
