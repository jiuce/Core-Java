package com.di;

public class Dependency {

	public Dependency() {
		// TODO Auto-generated constructor stub
		System.out.println("Dependency constructor");
	}

	public static Dependency dependencyFactory(){
		 
		return new Dependency();
	}
}
