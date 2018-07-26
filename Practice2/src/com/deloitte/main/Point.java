package com.deloitte.main;

public class Point{
	
	int x;
	int y;
	
	public Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return x+","+y;
		//return super.toString(); gives classname.hashcode
	}

	public static class MainClass {
		public static void main(String[] args) {
			Point p1 = new Point(2,4);
			String str;
			str="X & Y : "+p1;
			System.out.println(str);
		}
}
}
