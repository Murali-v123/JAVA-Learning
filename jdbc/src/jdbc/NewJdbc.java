package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class NewJdbc {

	public static void main(String[] args) {
		//load and register the driver
		Statement statement = null;
		Connection connect = null;
			try 
				{
					
				connect = JdbcUtil.getConnection();
				statement = connect.createStatement();
			
				//executeing query
				//String sql = "INSERT INTO student_info(id,name,age,city) VALUES(1,'murali',20,'bpet')";
				String sql = "INSERT INTO student_info(id,name,age,city) VALUES(4,'Madhu',22,'bpet')";
				int rowaffetcted=statement.executeUpdate(sql);
				
				//processing results
			if(rowaffetcted==0) {
				System.out.println("uable to process");	
				}
			else {
					System.out.println("Success");
				}	
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
				
				finally {
					try {
						JdbcUtil.closeconnection(connect, statement);
					}
					catch (Exception e) {
						e.printStackTrace();
					}
				}
	}

}
