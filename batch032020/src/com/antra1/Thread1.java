package com.antra1;

public class Thread1 extends Thread{
	
	Calculate ca;
	public Thread1(Calculate ca){
		this.ca=ca;
		
	}
	
	public void run() {
		
		ca.calcultaTable(2);
		System.out.println("in thread 1");
	}

}
