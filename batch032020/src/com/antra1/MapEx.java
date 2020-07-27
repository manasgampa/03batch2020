package com.antra1;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import com.antra.Student;

public class MapEx {

	public static void main(String[] args) {
		
		//HashMap hm=new HashMap();//no order//keys are not duplicated//values can be duplicated//HashTable Data structure
		//LinkedHashMap hm=new LinkedHashMap();//it is orderd//keys are not duplicated//values can be duplicated//HashTable and LiLinkedList DS
		//Hashtable hm=new Hashtable();
		ConcurrentHashMap hm=new ConcurrentHashMap();
		hm.put(1, "Manas");
		hm.put(832, new Student());
		hm.put(62, "Tom");
		hm.put(92, "David");
		hm.put(825, "Bob");
		hm.put(932, "Alice");
		hm.put(832, "Trump");
		hm.put(64, "Manas");
		System.out.println(hm.get(62));
		Set set=hm.keySet();
		Iterator it=set.iterator();
		while(it.hasNext()) {
			
			System.out.println(hm.get(it.next()));
			hm.put(98, "Naveen");
		}
		
		/*for(int i=0;i<hm.size();i++) {
			
			System.out.println(hm.get(i));
		}*/
		
		
	}
}
