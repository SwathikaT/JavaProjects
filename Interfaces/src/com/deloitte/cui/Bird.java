package com.deloitte.cui;

public class Bird extends Animal implements Flyer {

	@Override
	public void takeOff() {
		System.out.println("taking off..");
	}

	@Override
	public void fly() {
		System.out.println("flying..");

	}

	@Override
	public void land() {
		System.out.println("landing..");

	}
	
	public void buildNest() {
		System.out.println("building nest..");
		
	}
	
	public void layEggs() {
		System.out.println("laying eggs..");
		
	}
	

}
