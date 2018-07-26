package com.deloitte.exceptions.main;

public class MainClass {
	public static void main(String[] args) {
		try {
		System.out.println(Integer.parseInt(args[0])/Integer.parseInt(args[1]));
		System.out.println("End of try block");
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Enter 2 numbers !");
		}
		catch(NumberFormatException ex) {
			System.out.println("Enter valid numbers!");
		}
		catch(ArithmeticException ex) {
			System.out.println("Divide by zero ocurred !");
		}
		
		System.out.println("End of program execution");
	}

}
