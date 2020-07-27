package com.antra;

public class ExceptionTest {
	
	public static void main(String[] args) {
		System.out.println("in main method");
		doStuff();
	}
	public static void doStuff() {
		System.out.println("in do stuff");
		try {
		doMoreStuff();
		}catch(Exception e) {
			System.out.println("in exception");
		}
		System.out.println("in do stuff after");
	}
	
	public static void doMoreStuff() {
		System.out.println("in domore stuff");
		
		System.out.println(1/0);
		System.out.println("after do more stuff");
	}

}
