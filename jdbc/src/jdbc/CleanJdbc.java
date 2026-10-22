package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CleanJdbc {

	public static void main(String[] args) {
		//load and register the driver
		Statement statement = null;
		Connection connect = null;
				try 
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
				//establishing connection
				String url = "jdbc:mysql://localhost:3306/jdbctutorial";
				String name = "root";
				String password = "root";
				connect = DriverManager.getConnection(url,name,password);
				
				//creating statement
				statement = connect.createStatement();
				
				//executeing query
				//String sql = "INSERT INTO student_info(id,name,age,city) VALUES(1,'murali',20,'bpet')";
				String sql = "INSERT INTO student_info(id,name,age,city) VALUES(2,'Madhu',22,'bpet')";
				int rowaffetcted=statement.executeUpdate(sql);
				
				//processing results
				if(rowaffetcted==0) {
				System.out.println("uable to process");	
				}
				else {
					System.out.println("Success");
				}
				
				}
				
				catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				finally 
				{
					//closing the connection
					try {
						statement.close();
						connect.close();
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}
				
	}

}
