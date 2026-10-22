package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//establishing connection
		String url = "jdbc:mysql://localhost:3306/jdbctutorial";
		String name = "root";
		String password = "root";
		Connection connect = DriverManager.getConnection(url,name,password);
		
		//creating statement
		Statement statement = connect.createStatement();
		
		//executeing query
//		String sql = "INSERT INTO student_info(id,name,age,city) VALUES(1,'murali',20,'bpet')";
		String sql = "INSERT INTO student_info(id,name,age,city) VALUES(2,'Madhu',22,'bpet')";
		int rowaffetcted=statement.executeUpdate(sql);
		
		//processing results
		if(rowaffetcted==0) {
		System.out.println("uable to process");	
		}
		else {
			System.out.println("Sucess");
		}
		
		
		//closing the connection
		statement.close();
		connect.close();
	}

}
