package com.antra;

public class InheritenceEx {

	public static void main(String[] args) {
		
		Parent p=new Parent();
		//System.out.println(p.parentId);
		//System.out.println(p.childId);
		//p.parentM1();
		//p.childM1();
		p.m1();
		
		Child ch=new Child();
		//System.out.println(ch.childId);
		//System.out.println(ch.parentId);
		//ch.childM1();
		//ch.parentM1();
		ch.m1();
		
	}
}
