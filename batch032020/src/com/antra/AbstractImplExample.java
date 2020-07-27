package com.antra;

public class AbstractImplExample {

	public static void main(String[] args) {
		
		BMW bmw=new BMW();
		System.out.println(bmw.isAutomatic());
		System.out.println(bmw.isPowerSteering());
		
		Maruthi mar=new Maruthi();
		System.out.println(mar.isAutomatic());
		System.out.println(mar.isPowerSteering());
		
		
		Car car1=new BMW();
		System.out.println(car1.isAutomatic());
		
		
		Car car2=new Maruthi();
		System.out.println(car2.isAutomatic());
		
		
		Test t=new Test();
		t.m2(car2);
		System.out.println(Car.i);
		
		
		/*Employee emp=new Employee();
		System.out.println(emp.empId);
		emp.m1();*/
		/*Library lib=new Library();
		lib.m1();
		lib.m2();
		lib.m3();*/
		
	}
	
}
