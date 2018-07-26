package com.deloitte.main;

import java.util.LinkedList;

public class Activity1 {
	public static void main(String[] args) {
		
	LinkedList<String> result = new LinkedList<String>();
	
	result.add("B");
	result.add("C");
	result.add("D");
	result.add("X");
	result.add("Y");
	result.addLast("Z");
	result.addFirst("A");
	
	result.add(1,"A2");
	
	System.out.println("Original contents of result:"+result);
	
	result.remove("F");
	result.remove("2");
	
	System.out.println("contents of result after deletion:"+result);
	
	result.removeFirst();
	result.removeLast();
	
	System.out.println("result after deleting first and last:"+result);
	
	String val = result.get(2);
	result.set(2,val+"changed");
	
	System.out.println("result after change:"+result);
	}

}
