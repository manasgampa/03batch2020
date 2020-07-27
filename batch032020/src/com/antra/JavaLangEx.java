package com.antra;

public class JavaLangEx {
	
	public static void main(String[] args) {
		CreateContact contact1=new CreateContact(1,"Manas",9731);
		CreateContact contact2=new CreateContact(1,"Manas",9734);
		
		System.out.println(contact1==contact2);
		System.out.println(contact1.equals(contact2));
		
		
		/*System.out.println(contact1.hashCode());
		System.out.println(contact2.hashCode());*/
		
		/*Class cl=contact.getClass();
		System.out.println(cl.getName());*/
		//System.out.println(contact.getClass().getName());
		
	}
	

}
