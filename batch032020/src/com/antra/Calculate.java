package com.antra;

import java.util.Scanner;

public class Calculate {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a value");
		int a=sc.nextInt();
		System.out.println("Please enter b value");
		int b=sc.nextInt();
		
		System.out.println("div:"+ a/b);
		
		
		int add=a+b;
		System.out.println("add:"+add );
		
	}

}
