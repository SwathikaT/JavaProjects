package com.deloitte.main;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

class DBAccess {

	public Collection<String> getResult(){
	TreeSet<String> result = new TreeSet<String>();
	result.add("B");
	result.add("E");
	result.add("A");
	result.add("D");
	result.add("A");
	
	return result;
	}
}

public class DBAccessMain{
	public static void main(String[] args) {
		DBAccess dba = new DBAccess();
		Collection<String> dbResult = dba.getResult();
		for(String element:dbResult) {
			System.out.println(element);
			}
		
		System.out.println("--------------\n");
		Iterator<String> iterator = dbResult.iterator();
		//make it generic to avoid casting as hasNext returns object type
		String str;
		while(iterator.hasNext()) {
			str = iterator.next();
			System.out.println(str);
		}
	}
	
	
}
