package com.thread;

public class Producer implements Runnable {
	
	private SyncStack theStack ;
	private int num;
	private static int counter=0;

	public Producer(SyncStack mystack) {
		super();
		theStack = mystack;
		num=counter++;
	}

	@Override
	public void run() {
		char c;
		for(int i=0;i<200;i++){
		c= (char) (Math.random()*26 + 'A');
		theStack.push(c);
		System.out.println("Producer "+num+" ="+c);
		try{
			Thread.sleep((int)(Math.random()*300));
		}catch(Exception e){
			e.printStackTrace();
		}
		}

	}

}
