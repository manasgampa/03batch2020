package com.antra1;

public class Thread3 extends Thread{
	
	A a;
	B b;
	public Thread3(A a,B b) {
		this.a=a;
		this.b=b;
	}
	
	public void run() {
		a.foo(b);
	}

}
