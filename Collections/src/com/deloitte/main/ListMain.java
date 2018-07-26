package com.deloitte.main;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class ListMain {

	public static void main(String[] args) {
		//list can invoke only overridden public methods of linkedlist,hence we use linkedlist
		LinkedList<String> list = new LinkedList<String>();
		list.add("B");
		list.add("E");
		list.add("A");
		list.add("D");
		list.add("A");
		
		//lists are ordered and allows duplicate elements unlike sets
		
		for(String element:list) {
			System.out.println(element);
		}
			
		HashSet<String> set = new HashSet<String>();
			set.add("B");
			set.add("E");
			set.add("A");
			set.add("D");
			set.add("A");
			
			//lists are ordered and allows duplicate elements unlike sets
			System.out.println("-------\n");
			for(String element:set) {
				System.out.println(element);
			}
		}
	}

