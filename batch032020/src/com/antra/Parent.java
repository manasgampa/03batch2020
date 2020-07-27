package com.antra;

public class Parent {

	protected int parentId=56;
	int i=34;
	
	/*public Parent(String str) {
		
	}*/
	
	
	public void parentM1() {
		
		System.out.println("in parent m1 method");
	}
	
	public void parentM1(int i) {
		System.out.println("in parent m1 of int value:"+i);
		
	}
	
	final public void m1() {
		
		System.out.println("in m1 method of class parent");
	}
	
}
