package com.deloitte.main;

import java.util.HashSet;
import java.util.LinkedList;

class Address1{
		private String name;
		private String street;
		private String city;
		private String state;
		private String code;
		
		Address1(String n,String s,String c,String st,String cd){
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

public class Activity5{
		public void main(String[] args) {
			HashSet<Main> m1 = new HashSet<Main>();
			m1.add(new Main("J.W.west","11 Oak Ave","Urbana","IL","61801"));
			m1.add(new Main("Ralph Baker","1142 Maple Lane","Mahome","IL","61853"));
			m1.add(new Main("Tom Carlton","867 Elm St","Champaign","IL","61820"));
			
			for(Main address:m1)
			System.out.println(address);
		}
		
}
