package inisdearray;

import java.util.Scanner;

public class Even_inAraay {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the no of inside the array");
		int a[]= {scan.nextInt()};
		
		for(int i=0;i<=a.length-1;i++) {
			if(i%2==0) {
				System.out.println("even");
			}
			else
				System.out.println("odd");
		}
	}

}
