package com.antra1;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCEx1 {
	
	public static void main(String[] args) throws SQLException {
		//Driver d=new oracle.jdbc.driver.OracleDriver();
		//DriverManager.registerDriver(d);
		//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter id");
		int id=sc.nextInt();
		System.out.println("please enter name");
		String name=sc.next();
		System.out.println("please enter sal");
		int sal=sc.nextInt();
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc", "root", "manas");

		System.out.println(con);
		Statement stmt=con.createStatement();
		//stmt.executeUpdate("insert into emp values("+id+","+"'"+name+"'"+","+sal+")");
		ResultSet rs=stmt.executeQuery("select* from person;");
		ResultSetMetaData rd= rs.getMetaData();
		System.out.println(rd.getColumnName(1));
		
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
		}
		
		con.close();
	}

}
