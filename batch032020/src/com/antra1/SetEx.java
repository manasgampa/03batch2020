package com.antra1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import com.antra.Student;

public class SetEx {
	
	public static void main(String[] args) {
		
		TreeSet ts=new TreeSet(new SortTree());
		ts.add(89);
		ts.add(90);
		ts.add(65);
		ts.add(110);
		ts.add(104);
		ts.add(8);
		ts.add(12);
		ts.add(56);
		ts.add(1);
		ts.add(451);
		ts.add(172);
		System.out.println(ts);
		
		
		//HashSet hs=new HashSet();//HashTable DS //no duplicates //no proper order
		
		/*LinkedHashSet hs=new LinkedHashSet();//Linked List and HashTable DS//it is ordered
		hs.add(89);
		hs.add("Manas");
		hs.add(89);
		hs.add(new Student());
		hs.add(50.23f);
		hs.add('a');
		
		System.out.println(hs);
		
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}*/
		
		/*for(Object obj:hs) {
			System.out.println(obj);
		}*/
	}

}
