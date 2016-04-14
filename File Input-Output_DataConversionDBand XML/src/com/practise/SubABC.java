package com.practise;

public class SubABC extends SuperABC {
		
	int x1 = 9;
	
	public void showSuper(){
		System.out.println(b);
		showb();
		showx();
	}
	
	public void showx(){    // for Superclass ref var to refer a subclass object, and use the subclass 
		System.out.println("From subclass showx" +x1); //methods, same method must be there in both super and sub class
	}

	// super class ref var cannot show method excusive to its subclass
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperABC s1 = new SubABC();
		s1.showx();
		SubABC s2 = new SubABC();
		s2.showb();
	
//		s1.showSuper(); // Compile Error: "method is undefined for superABC"
	}

}
