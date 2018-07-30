package com.deloitte.exceptions.main;

class IllegalAgeException extends Exception{
	public String getMessage() {
		return "The person has to be 18 or above to register for voting";
	}
}

class Voter{
	public void register(int age) throws IllegalAgeException {
		// TODO Auto-generated method stub
		if(age<18) {
			throw new IllegalAgeException();
		}
	}
}
public class CustomException {
	public static void main(String[] args) {
		Voter voter = new Voter();
		
		try {
			voter.register(16);
		} catch (IllegalAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
