package com.naughtycodes.app.main.runs;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LookAtThreading implements Runnable {

	public String message;
	public LookAtThreading(String s) {
		this.message = s;
	}
	public void T1() {
		
		System.out.println(
				"Running Thread Name : "+Thread.currentThread().getName()+"\n"+ 
				"Running Thread Id : "+Thread.currentThread().getId()+"\n" +
				"Running Thread Message : "+this.message+"\n"
				);
		
		for(int i=0; i<=3; i++) {
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			} catch (Exception e) {
				
			}
			
			System.out.println(i);
		}
	}
	
	public static void main(String args[]) {

		Runtime rn = Runtime.getRuntime();
		rn.addShutdownHook(new MyThread());
		
		LookAtThreading l = new LookAtThreading("");
		
		ThreadGroup tg = new ThreadGroup("g1");
		
		Thread t1 = new Thread(tg, l, "one");
		Thread t2 = new Thread(tg, l, "two");
		Thread t3 = new Thread(tg, l, "three");
		
		
		t3.setPriority(Thread.MAX_PRIORITY);
		t3.setName("MaxPriorityThread");
		
		System.out.println();
		
		ExecutorService ex = Executors.newFixedThreadPool(5);
		
		int j = 0;
		while(j<=2) {
			Runnable r = new LookAtThreading(""+j);
			ex.execute(r);
			j++;
		}
		
		ex.shutdown();
		

		
//		
//		System.out.println(
//						"Thread Name : "+t1.getName()+"\n"+ 
//						"Thread Id : "+t1.getId()+"\n"
//						);
//						
//		System.out.println(
//				"Thread Name : "+t2.getName()+"\n"+ 
//				"Thread Id : "+t2.getId()+"\n"
//				);
//		
//		System.out.println(
//				"Thread Name : "+t3.getName()+"\n"+ 
//				"Thread Id : "+t3.getId()+"\n"
//				);
//		
		
//		t1.start();
//		try {
//			t1.join();
//		} catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
//		
//		t2.start();
//		t3.start();
		
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	

}

class MyThread extends Thread {

	public void run() {
		System.out.println("Calling shutdown hook");
	}
}

 
