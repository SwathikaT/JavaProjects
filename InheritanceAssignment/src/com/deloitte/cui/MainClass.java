package com.deloitte.cui;

import com.deloitte.livingbeings.Man;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Man man1= new Man();
		man1.leftEye.color= "Black";
		man1.leftEye.power= 2.5f;
		man1.rightEye.color= "Black";
		man1.rightEye.power= 2.5f;
		
		System.out.println(man1.leftEye.color);
		System.out.println(man1.leftEye.power);
		
	}

}
