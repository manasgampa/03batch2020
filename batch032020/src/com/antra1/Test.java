package com.antra1;

import com.antra.Parent;
import com.antra.Student;

public class Test extends Parent{
	
	public static void main(String[] args) {
		/*Parent p1=new Parent();
		p1.parentId=56;*/
		
		Test t=new Test();
		System.out.println(t.parentId);
		Student st=new Student();
		//System.out.println(st.studentId);
	}

}
