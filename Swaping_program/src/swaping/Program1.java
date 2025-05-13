package swaping;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the first number");
		int a=scan.nextInt();
		System.out.println("enter the second number");
		int b=scan.nextInt();
		System.out.println(a+"  "+b);
		int c;
		c=a;
		a=b;
		b=c;
		
		System.out.println(a+"  "+b);
		
	}

}
