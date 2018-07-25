package com.deloitte.main;

public class Array2 {

 
 public static void main(String[] args) {
	 int[] a = {1,2,3,4,5};
	 int[] b = new int[10];
	
 
	//arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
  System.arraycopy(a,0,b,0,5);
  
  for(int target:b) {
	    System.out.print(target+" ");}
  
}
}
