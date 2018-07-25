package com.deloitte.cui;

public class RiverBarge extends Vehicle implements Sailer {
	
	@Override
	public void dock() {
		System.out.println("docking");
		
	}
	@Override
	public void cruise() {
		System.out.println("cruising");
	}

}
