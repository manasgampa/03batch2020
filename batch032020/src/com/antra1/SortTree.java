package com.antra1;

import java.util.Comparator;

public class SortTree implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		
		if(i1<i2) {
			//if object1 has to come after object 2
			return 1;
		}else if(i1>i2) {
			//if object1 has to come before obj2
			return -1;
		}else {
			
			return 0;
		}
		
	}

	
	
}
