package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {
	static {
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException 
	{
		String url = "jdbc:mysql://localhost:3306/jdbctutorial";
		String name = "root";
		String password = "root";
		return DriverManager.getConnection(url,name,password);
	}
	
	public static void closeconnection(Connection connect,Statement statement) throws SQLException
		{
				
			statement.close();
			connect.close();
		}
}
