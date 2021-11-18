package com.prasadu.start;

class Counter{
	int c;
	public synchronized void count() {
		c++;
	}
}

public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
		Counter obj=new Counter();
		Thread t1=new Thread(()-> {
				for(int i=0;i<1000;i++) {
					obj.count();
				}
		});
		Thread t2=new Thread(new Runnable() {
			public void run() {
				for(int i=0;i<1000;i++) {
					obj.count();
				}
			}
		});
t1.start();
t2.start();
t1.join();
t2.join();

System.out.println(obj.c);
	}

}
