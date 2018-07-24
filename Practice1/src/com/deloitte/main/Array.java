package com.deloitte.main;

public class Array {
	public static void main(String[] args) {
		//single 
		/*int num[];
		num = new int[10];
		num[5]=3;
		for(int target:num) {
	    System.out.println(target);}
		
		System.out.println(num.length);*/
		
		//multidimension
		int n[][];
		n= new int[3][4];
		n[2][3]=7;
		n[1][1]=8;
		n[1][3]=3;
		
		for(int[] m:n) {
			for(int t:m) {
			System.out.println(t);
		}
}

}}
