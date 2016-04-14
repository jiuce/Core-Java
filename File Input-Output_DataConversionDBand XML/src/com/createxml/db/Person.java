package com.createxml.db;

public class Person {
	int i;
	
	public Person(int j){
		i=j;
	}
	
	public void speak(){
		System.out.println(i);	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Person p=null;
//p.speak();
Person p= new Person(5);
Person q= new Person(10);
Person r= new Person(15);
Person m;
m=q;
q=p;
p=r;
r=m;
p.speak();
q.speak();
r.speak();
	}

}
