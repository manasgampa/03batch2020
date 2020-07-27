package com.antra1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import com.antra.Student;

public class CollectionEx1 {
	
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();//10//Object Array Data Structure//retriving is very easy
		//LinkedList al=new LinkedList();//Daouble linked list DS//Insertion of object is easier
		al.add(10);
		al.add("Manas");
		al.add(new Student());
		al.add(54.89f);
		al.add(10);
		
	Iterator it = al.iterator();
		
	while(it.hasNext()) {
		
		System.out.println(it.next());
		//al.add(96);
	}
		List newList=Collections.unmodifiableList(al);
		
		newList.add(67);
		
		/*for(int i=0;i<al.size();i++) {
			
			System.out.println(al.get(i));
		}*/
		
		
		/*System.out.println(al);
		al.remove(2);
		System.out.println(al);
		System.out.println(al.get(2));
		*/
		//System.out.println(al.size());
		
		/*for(Object obj:al) {
			
			System.out.println(obj);
		}*/
		
		
	}
	
}
