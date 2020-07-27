package com.antra;

public class Child extends Parent{

	private int childId=91;
	int i=45;
	
	/*public Child() {
		
		super("manas");
	}*/
	
	public void childM1() {
		System.out.println(super.i);
		
		System.out.println("in  child  m1 method");
	}
	
	/*public void m1() {
		System.out.println("in child class m1 method override");
		
	}*/

}
