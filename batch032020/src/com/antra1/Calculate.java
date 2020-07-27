package com.antra1;

public class Calculate {

	
	public synchronized void calcultaTable(int n) {
		
		for(int i=1;i<=10;i++) {
			
			System.out.println(n+"*"+i+"="+(i*n));
		}
	}
}
