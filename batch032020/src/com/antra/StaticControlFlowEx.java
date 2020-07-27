package com.antra;

public class StaticControlFlowEx {
	
	static int i=10;
	
	static {
		
		System.out.println("in static block 1");
	}
	
	public static void m1() {
		
		System.out.println("in m1 method");
	}
	
	public static void main(String[] args) {
		
		System.out.println("in main method");
		m1();
	}
	
	

}
