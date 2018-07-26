package com.deloitte.main;

import java.util.LinkedList;

	class Address{
		private String name;
		private String street;
		private String city;
		private String state;
		private String code;
		
		Address(String n,String s,String c,String st,String cd){
			name = n;
			street =s;
			city=c;
			state=st;
			code =cd;
		}
		
		public String toString() {
			return name+"\n"+street+"\n"+city+"\n"+state+"\n"+code;
		}
	}

public class Activity4{
		public void main(String[] args) {
			LinkedList<Address> m1 = new LinkedList<Address>();
			m1.add(new Address("J.W.west","11 Oak Ave","Urbana","IL","61801"));
			m1.add(new Address("Ralph Baker","1142 Maple Lane","Mahome","IL","61853"));
			m1.add(new Address("Tom Carlton","867 Elm St","Champaign","IL","61820"));
			
			for(Address address:m1)
			System.out.println(address);
		}
		
	}
