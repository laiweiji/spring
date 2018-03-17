package cn.study.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class BaseDao {

	private static  String driver;

	private static  String url;

	private static String username;

	private static String password;

	static{

		Properties pro=new Properties();

		
		String path="/database.properties";
		
		InputStream is = BaseDao.class.getResourceAsStream(path);
		try {
			pro.load(is);
			driver=pro.getProperty("jdbcdriver");
			url=pro.getProperty("jdbcurl");
			username=pro.getProperty("jdbcusername");
			password=pro.getProperty("jdbcpassword");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	} 
	PreparedStatement state=null;
	Connection con=null;

	public Connection getConnection(){
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
		
	}
	public int executeUpdate(String sql,Object...obj){
		Connection connection = getConnection();
		try {
			state=(PreparedStatement)connection.prepareStatement(sql);
			if(obj!=null){
				for (int i = 0; i < obj.length; i++) {
					//insert into student values(?,?)
					   state.setObject(i+1, obj[i]);
				}
			}
			return state.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public ResultSet executeQuery(String sql,Object...obj){
		Connection connection = getConnection();
		try {
			state=(PreparedStatement)connection.prepareStatement(sql);
			if(obj!=null){
				for (int i = 0; i < obj.length; i++) {
					//insert into student values(?,?)
					   state.setObject(i+1, obj[i]);
				}
			}
			return state.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public void closeAll(){
		try {
			state.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
