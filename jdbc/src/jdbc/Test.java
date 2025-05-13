package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.*;


public class Test{
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter student no");
		int stno =scan.nextInt();
		System.out.println("Enter student name");
		String stname =scan.next();
		System.out.println("Enter student Age");
		int age =scan.nextInt();
		
		
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/compony","root","Harshad@030802");
			Statement st =con.createStatement();
		//	String query ="insert into syudent values (?,?,?)";
			String query ="select * from syudent";
			PreparedStatement pt =con.prepareStatement(query);
			ResultSet rs =pt.executeQuery();
			
			//pt.setInt(1,stno);
			//pt.setString(2, stname);
			//pt.setInt(3, age);
			
			//pt.executeUpdate();
			
			while(rs.next()){
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
				
			}
			
			
			//System.out.println("record inserted successfully");
		}
		catch (Exception e) {
			e.printStackTrace();
			
			
			// TODO: handle exception
		}
	}

}
