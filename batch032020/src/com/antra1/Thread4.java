package com.antra1;

public class Thread4 extends Thread{
	
	A a;
	B b;
	
	public Thread4(A a,B b) {
		this.a=a;
		this.b=b;
	}
	@Override
	public void run() {
		b.bar(a);
	}
}
