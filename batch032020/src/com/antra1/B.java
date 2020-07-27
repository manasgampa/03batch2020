package com.antra1;

public class B {
	
	public synchronized void bar(A a) {
		System.out.println("in bar method of B");
		a.last();
		
	}
	
	public synchronized void last() {
		
		System.out.println("in B class last method ");
	}

}
