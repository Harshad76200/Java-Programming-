package inisdearray;

import java.util.Scanner;

public class Minimum_no_find {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of array");
		int arr[]=new int [scan.nextInt()];
		
		System.out.println("enter the element of array");
		for (int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		
		int smallest=arr[0];
		for (int i=0;i<=arr.length-1;i++) {
			if (arr[i]<smallest) {
				smallest=arr[i];
				
			}
		}
		System.out.println("This are the smallest element :  "+smallest);
	}

}
