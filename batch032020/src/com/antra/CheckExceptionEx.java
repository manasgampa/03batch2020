package com.antra;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class CheckExceptionEx {
	
	public static void main(String[] args) throws EmployeeNotFound {
		
	throw new EmployeeNotFound("no employ");
		//throw new StudentNotFoundException("no student available");
	
	/*	try {
			System.out.println(1/0);
			FileInputStream fis=new FileInputStream("abc.txt");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("in finally block");
		}
		
		System.out.println("in class");*/
	}

}
