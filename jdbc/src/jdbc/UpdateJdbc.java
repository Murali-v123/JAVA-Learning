package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UpdateJdbc {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {


		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		String url = "jdbc:mysql://localhost:3306/jdbctutorial";
		String name = "root";
		String password = "root";
		Connection connect=DriverManager.getConnection(url,name,password);
		
		java.sql.Statement statement = connect.createStatement();
		
		String sql = "update student_info set age=20 where id=1";
		int row = statement.executeUpdate(sql);
		if(row ==0) {
			System.out.println("Failure");
		}
		else {
			System.out.println("Sucsess");
		}
		
		statement.close();
		connect.close();
	}

}
