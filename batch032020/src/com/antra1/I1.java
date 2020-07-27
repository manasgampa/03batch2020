package com.antra1;

public interface I1 extends I2{

	
	public void m1();
	
	public default void m2() {
		System.out.println("in m2 method of interfaces");
		
	}
	
	public static void staticM1() {
		
		System.out.println("in static m1 method");
	}
	
}
