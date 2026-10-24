package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExecuteBatch {

	public  static void main(String[] args) {
		Connection connect=null;
		PreparedStatement prestmnt=null;
		Scanner sc=null;
		
		try {
			connect=JdbcUtil.getConnection();
			String sql="update student_info set age=? where id=?";
			prestmnt=connect.prepareStatement(sql);
			sc=new Scanner(System.in);
			System.out.println("Enter the id");
			Integer id=sc.nextInt();
			System.out.println("Enter the age");
			Integer age=sc.nextInt();
			
			prestmnt.setInt(1,age);
			prestmnt.setInt(2, id);
			prestmnt.addBatch();
			int[] rowaffetcted=prestmnt.executeBatch();
			if(rowaffetcted != null) {
				System.out.println("success");
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			if(sc!=null) {
				sc.close();
			}
			try {
				JdbcUtil.closeconnection(connect, prestmnt);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
