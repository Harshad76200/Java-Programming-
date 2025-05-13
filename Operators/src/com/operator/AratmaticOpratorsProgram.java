package com.operator;

import java.util.Scanner;

public class AratmaticOpratorsProgram {

		
		// Operation 
	 public void add(int a , int b) {
		 int add = a+b;
		 System.out.println("This is addition : "+ add);	
	}
	 
	 public void sub(int a , int b) {
		 int sub = a-b;
		 System.out.println("This is substraction : "+sub);
	 }
	 
	 public void multi(int a , int b) {
		 int mul= a*b;
		 System.out.println("This is Multiplication : "+ mul);
	 }
	 
	 void div (int a , int b) {
		 int div= a/b;
		 System.out.println("This is Division : "+ div);
	 }
	 
	 void mod (int a , int b) {
		 int mod = a%b;
		 System.out.println("This is Modulas : "+mod);
	 }
	 
	 public static void main(String[] args) {
		Scanner scan = new Scanner(System.in );
		System.out.println("Enter 1st Number ");
		int a =scan.nextInt();
		System.out.println("Enter 2nd Number ");
		int b = scan.nextInt();
		
		AratmaticOpratorsProgram ap =new AratmaticOpratorsProgram();
		ap.add(a, b);
		ap.div(a, b);
		ap.sub(a, b);
		ap.mod(a, b);
		ap.multi(a, b);
	}
}
