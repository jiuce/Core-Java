package com.thread;

public class Consumer implements Runnable{

	SyncStack theStack;
	int num;
	char c;
	private static int counter = 0;
	public Consumer(SyncStack s) {
		
		theStack = s;
		num=counter++;
	}
	@Override
	public void run() {
		for(int i=0;i<200;i++){
			c=theStack.pop();
			System.out.println("Consumer "+num+" ="+c);
			try{
				Thread.sleep((int)(Math.random()*300));
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	
}
