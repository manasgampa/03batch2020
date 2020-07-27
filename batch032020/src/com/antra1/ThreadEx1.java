package com.antra1;

public class ThreadEx1 implements Runnable{//extends Thread{

	public void run() {
	
		for(int i=0;i<100;i++) {
			System.out.println("in run thread:"+i);
			
		}
		
	}
	
	
}
