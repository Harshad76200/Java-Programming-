package com.operator;

public class PrifexPostfix {

	public static void main(String[] args) {
		int a =10;
		
		int pri = ++a; 
		System.out.println("prefix   ++a : " + pri);
		
		a=10;  // value reset 
		int post = a++;
		System.out.println("Postfix  a++ : " + post );
		
		System.out.println("Value of a after postfix  "+ a);
	}
}
