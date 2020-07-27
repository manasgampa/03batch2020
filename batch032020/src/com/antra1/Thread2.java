package com.antra1;

public class Thread2 extends Thread{

	Calculate ca;
	public Thread2(Calculate ca){
		this.ca=ca;
		
	}
	
	public void run() {
		
		ca.calcultaTable(5);
		
		System.out.println("in thread 2");
	}
}
