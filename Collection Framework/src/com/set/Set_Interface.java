package com.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Interface {

	public static void main(String[] args) {
		
		
		//Set 
//		//HashSet
//		Set<Integer> hs =new HashSet<>();
//		hs.add(1);
//		hs.add(23);
//		hs.add(32);
//		hs.add(12);
//		hs.add(1);
//		System.out.println(hs);
		
		
		//LinkedHashSet
		LinkedHashSet<Integer> ls =new LinkedHashSet<>();
		ls.add(32);
		ls.add(56);
		ls.add(45);
		ls.add(32);
		ls.add(10);
		System.out.println(ls);
		
		//TreeSet  
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(22);
		ts.add(66);
		ts.add(75);
		ts.add(32);
		ts.add(90);
		ts.add(66);
		System.out.println(ts);
		
		
	}
}
