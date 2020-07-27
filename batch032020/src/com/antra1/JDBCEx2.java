package com.antra1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCEx2 {
	
	public static void main(String[] args) throws SQLException  {
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("please enter id");
		int id=sc.nextInt();
		System.out.println("please enter name");
		String name=sc.next();
		System.out.println("please enter sal");
		int sal=sc.nextInt();
		*/
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc", "root", "manas");
		try {
			
		
		con.setAutoCommit(false);
		PreparedStatement pstmt=con.prepareStatement("insert into person values(?,?,?)");
		
		pstmt.setInt(1, 4);
		pstmt.setString(2,"Manas");
		pstmt.setInt(3, 743);
		pstmt.addBatch();
		
		pstmt.setInt(1, 6);
		pstmt.setString(2,"Zhou");
		pstmt.setInt(3, 912);
		pstmt.addBatch();
		
		pstmt.setInt(1, 5);
		pstmt.setString(2,"Naveen");
		pstmt.setInt(3, 936);
		pstmt.addBatch();
		
		pstmt.executeBatch();
		
		con.commit();
		con.close();
		} catch (SQLException e) {
			con.rollback();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
