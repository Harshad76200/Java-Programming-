package com.operator;

public class BitwiseOprater {
	
	public static void main(String[] args) {
		int a =3;
		int b=7;  
		
		System.out.println("Bitwise AND : "+ (a & b));
		System.out.println("Bitwise OR  : "+ (a | b));
		System.out.println("Bitwise XOR : "+ (a ^ b));
		System.out.println("Bitwise NOT : "+ (~a));
		System.out.println("Left Shift  : "+ (a << 2));
		System.out.println("Right Shift : "+ (a >> 2));
		System.out.println("Unsinged Right Shift : "+ (a >>> 2));
	}

}
