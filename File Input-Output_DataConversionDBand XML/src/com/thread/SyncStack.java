package com.thread;

import java.util.ArrayList;
import java.util.List;

public class SyncStack {
	private List<Character> buffer = new ArrayList<Character>(400);

	public synchronized void push(char c) {
		this.notify();
		buffer.add(c);
	}
	
	public synchronized char pop(){
		while(buffer.size()==0){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		char c=buffer.remove(buffer.size()-1);
		return c;
	}

}
