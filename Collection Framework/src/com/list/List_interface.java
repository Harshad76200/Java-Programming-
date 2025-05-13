package com.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class List_interface {
	public static void main(String[] args) {
		
		
//		//Array List 
//		ArrayList<Integer> list =new ArrayList<Integer>();
//		
//		list.add(10);
//		list.add(20);
//		list.add(40);
//		list.add(2,25);
//		
//		System.out.println(list);
		
		
		
//		//LinkedList
//		LinkedList<Integer> llist =new LinkedList<>();
//		llist.add(30);
//		llist.add(40);
//		llist.add(50);
//		llist.add(70);
//		llist.remove(1);
//		System.out.println(llist);
		
		
//		//vector
//		Vector<String> v =new Vector<>();
//		v.add("5");
//		v.add("23");
//		v.add("50"); 
//		System.out.println(v);

		
		//stack
		Stack<Integer> s =new Stack<>();
		s.push(10);
		s.push(10);
		s.push(20);
		
		System.out.println(s);
		System.out.println(s.pop());
		System.err.println(s.peek());
	}

}
