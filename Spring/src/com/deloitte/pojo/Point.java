package com.deloitte.pojo;

public class Point {

	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
		System.out.println("setX");
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
		System.out.println("setY");
	}

	public Point() {
		System.out.println("Point instantiated");
	}

	@Override
	public String toString() {
		return x + ":" + y;
	}
}
