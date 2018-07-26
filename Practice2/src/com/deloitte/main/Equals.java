package com.deloitte.main;

public class Equals {
	int x;
	int y;
	
	public Equals(int x,int y){
		this.x=x;
		this.y=y;
	}
		public boolean equals(Object target) {
			if(target!=null) {
				if(target instanceof Point) {
					Point p = (Point)target;
					if(x==p.x && y==p.y) {
						return true;
					}
				}
			}
			return false;
			
		}
		
}
	
/*public class MainClass {
		public static void main(String[] args) {
			Point p1 = new Point(2,4);
			Point p2 = new Point(2,4);
			System.out.println(p1.equals(p2));
		}
}*/
