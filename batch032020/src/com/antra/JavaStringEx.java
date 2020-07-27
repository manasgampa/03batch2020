package com.antra;

public class JavaStringEx {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder();//thread safe
		
		/*StringBuffer sb1=new StringBuffer("Manas");
		StringBuffer sb2=new StringBuffer("Manas");
		String str3=sb1.toString();
		String str4=sb2.toString();
		System.out.println(str3.equals(str4));*/
		
		
		/*String str1=new String("Manas");
		String str3="Manas";
		String str2="Manas";
		System.out.println(str2==str3);*/
		//System.out.println(str1.equals(str2));
		
		/*ImmutableEx im=new ImmutableEx("manas");
		String st2=im.concate("Gampa");
		System.out.println(im);
		System.out.println(st2);*/
		
		/*String str=new String("Manas");
		String str2=str.concat("kumar");
		System.out.println(str2);*/
	}
}
