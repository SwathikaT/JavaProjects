package com.deloitte.cui;

public class Airplane implements Flyer {

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

}
