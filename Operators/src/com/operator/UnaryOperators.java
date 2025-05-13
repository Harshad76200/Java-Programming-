package com.operator;
//perform operations on a single operand
public class UnaryOperators {
	public static void main(String[] args) {
		
		int a = 5;
		int b = -a;
		
		System.out.println("Unary Plus : "+ (+a));
		System.out.println("Unary Minus: "+ b);
		System.out.println("Increment  : "+ (++a));
		System.out.println("Decrement  : "+ (--a));
		
		
	}

}
