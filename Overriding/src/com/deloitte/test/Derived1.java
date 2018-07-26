package com.deloitte.test;

public class Derived1 extends Base {
	
	
	public Derived1() {
		super(i);
		//Super must be used for parameterized constructors in the base class
		System.out.println("Derived1");
		
	}

}
