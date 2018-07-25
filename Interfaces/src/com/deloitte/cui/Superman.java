package com.deloitte.cui;

public class Superman extends Animal implements Flyer {

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
	
	public void leapBuilding() {
		System.out.println("leaping building!");
		
	}
	
	public void stopBullet() {
		System.out.println("Stopping bullet !");
		
	}

}
