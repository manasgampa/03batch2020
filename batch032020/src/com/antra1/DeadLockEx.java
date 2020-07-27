package com.antra1;

public class DeadLockEx {

	
	
	public static void main(String[] args) {
		
		A a=new A();
		B b=new B();
		
		Thread3 th1=new Thread3(a,b);
		Thread4 th2=new Thread4(a,b);
		th1.start();
		th2.start();
		
		
	}
	
}
