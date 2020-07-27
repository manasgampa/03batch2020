package com.antra1;

public interface I2 {
	
	default void m2() {
		System.out.println("in m2 method of I2 interface");
	}
	
	default void m3() {
		
		System.out.println("in I2 interface default m3 method");
	}

}
