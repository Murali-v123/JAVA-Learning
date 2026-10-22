package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteJdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/jdbctutorial";
		String password="root";
		String name="root";
		Connection connect=DriverManager.getConnection(url,name,password);
		
		Statement statement=connect.createStatement();
		
		String sql="delete from student_info where id=2";
		int rows=statement.executeUpdate(sql);
		if(rows==0) {
			System.out.println("Failure");
		}
		else {
			System.out.println("Success");
		}
		
		connect.close();
		statement.close();
	}

}
