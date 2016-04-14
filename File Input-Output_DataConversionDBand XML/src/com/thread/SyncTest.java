package com.thread;

public class SyncTest {

	public static void main(String[] args) {
		SyncStack myStack = new SyncStack();
		Producer p1=new Producer(myStack);
		Thread t1= new Thread(p1);
		t1.start();
		Producer p2=new Producer(myStack);
		Thread t2= new Thread(p2);
		t2.start();
		Consumer c1 = new Consumer(myStack);
		Thread t3=new Thread(c1);
	    t3.start();
		Consumer c2 = new Consumer(myStack);
		Thread t4=new Thread(c2);
	    t4.start();
	}

}
