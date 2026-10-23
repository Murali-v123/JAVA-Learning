package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class preapredstmt {

	public static void main(String[] args ) {
		//load and register the driver
		Connection connect = null;
		PreparedStatement prestmnt=null;
		Scanner sc = null;
			try 
				{
					
				connect = JdbcUtil.getConnection();
//				statement = connect.createStatement();
				String sql = "INSERT INTO student_info(id,name,age,city) VALUES(?,?,?,?)";
				prestmnt = connect.prepareStatement(sql);
				
//				getting values from user
				 sc=new Scanner(System.in);
				System.out.println("Enter Your Id:");
				Integer id = sc.nextInt();
				
				System.out.println("Enter Your name:");
				String name = sc.next();
				
				System.out.println("Enter Your age:");
				Integer age = sc.nextInt();
				
				System.out.println("Enter Your city:");
				String city = sc.next();
				
				prestmnt.setInt(1, id);
				prestmnt.setString(2, name);
				prestmnt.setInt(3, age);
				prestmnt.setString(4, city);
			
				//executeing query
				int rowaffetcted=prestmnt.executeUpdate();
				
				//processing results
				if(rowaffetcted==0) {
					System.out.println("uable to process");	
					}
				else {
						System.out.println("Success");
					}	
				}
			
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
				
			finally {
				if(sc!=null) {
					sc.close();
				}
				try {
					JdbcUtil.closeconnection(connect, prestmnt);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
	}
}
