package inisdearray;

import java.util.Scanner;

public class Addition_array {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the size of array");
		int arr1[]=new int [scan.nextInt()];
		int arr2[]=new int [arr1.length];
		int arr3[]=new int [arr1.length];
		
		System.out.println("enter the "+arr1.length+" to be stored in 1st array");
		for (int i=0;i<=arr1.length-1;i++) {
			arr1[i]=scan.nextInt();
		}
		
		System.out.println("enter the "+arr2.length+" to be stored in 2nd array");
		for (int i=0;i<=arr2.length-1;i++) {
			arr2[i]=scan.nextInt();
		}
		
		//adding the element of 1st array and 2nd array and storing the 3rd array
		for(int i=0;i<=arr1.length-1;i++) {
			arr3[i]=arr1[i]+arr2[i];
		}
		
		//display the 3rd array
		System.out.println("third array is : ");
		for(int x:arr3) {
			System.out.print(x+ " ");
		}
		
	}
}
