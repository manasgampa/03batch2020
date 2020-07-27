package com.antra1;

public class A {
	
	int i=10;
	
	public synchronized void foo(B b) {
		
		System.out.println("in foo method of A");
		b.last();
	}
	
	public synchronized void last() {
		
		System.out.println("A class last method");
	}
	

}
