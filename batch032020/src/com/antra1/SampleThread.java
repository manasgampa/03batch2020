package com.antra1;

public class SampleThread {
	
	public static void main(String[] args) {
		
		ThreadEx1 t1=new ThreadEx1();
		Thread th1=new Thread(t1);
		th1.start();
		
		
		
		//System.out.println(Thread.currentThread());
		
		/*ThreadEx1 t1=new ThreadEx1();
		//t1.run();
		t1.start();//--thread is created it will execute
		
		for(int i=0;i<100;i++) {
			System.out.println("in main thread:"+i);
			
		}*/
		
	}

}
