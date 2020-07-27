package com.antra1;

@FunctionalInterface
public interface Car {

	public boolean isAutomatic();
	
	default void m1() {
		System.out.println("in default");
		
	}
	
}
