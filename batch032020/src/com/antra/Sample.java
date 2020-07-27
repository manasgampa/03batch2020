package com.antra;

public class Sample {
	
	Car c;
	
	public void setObject(Car c) {
		this.c=c;
		System.out.println(c);
	}
	
	public Car getObject() {
		
		return this.c;
	}

	public static void main(String[] args) {
		
		Sample s=new Sample();
		s.setObject(new BMW());
		System.out.println(s.getObject());
		
		
		
		
		byte b=127;//size 8 bits(1 byte) range 127 to -128
		//short s=12321;//size 2 bytes rage 32768 to 32767
		int i=32;//size 4 bytes range -2^31 to (2^31)-1
		long l=523432;//size 8 bytes range -2^63 to (2^63)-1
		
		float f=43.45f;//size 4 bytes //5 to 6 decimal points
		double d=54.32432;// size 8 bytes //15 to 16 decimal points
		
		char ch='a';
		System.out.println(ch);
		
		boolean bl=true;//no size //no range
		
		/*int i=10;//a to z,A to Z,0 to 9, _ and $
		int I=10;
		int n_10=34;*/
		
	}
	
	public void m1() {
		
	}
}
