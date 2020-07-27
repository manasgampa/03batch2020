package com.antra1;

public class TestThread {
	
	public static void main(String[] args) {
		
		Calculate ca=new Calculate();
		Thread1 t1=new Thread1(ca);
		Thread2 t2=new Thread2(ca);
		t1.setPriority(10);//1-low priority//5-mid proirity//10 max priority
		t2.setPriority(1);
		t1.setName("Manas");
		t2.setName("JinJin");
		t1.start();//started----
		t2.start();//started-----
		
	}

}
