package inisdearray;

import java.util.Scanner;

public class MeargeArray {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the length of 1st array");
		int arr1[]=new int[scan.nextInt()];
		System.out.println("enter  the length of 2nd array");
		int arr2[]=new int[scan.nextInt()];
		
		System.out.println("enter the number of which stored in first array");
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[i]=scan.nextInt();
			
		}
		
		System.out.println("enter the number of which stored in 2nd array");
		for(int i=0;i<=arr2.length-1;i++) {
			arr2[i]=scan.nextInt();
			
		}
		
		int arr3[]=new int[(arr1.length + arr2.length)];
		//copyinng the element of the 3rd array
		for(int i=0;i<=arr1.length-1;i++) {
			arr3[i]=arr1[i];
		}
		
		int j=0;
		for(int i=arr1.length;i<=arr3.length-1;i++) {
			arr3[i]=arr2[j];
			j++;
		}
		
		System.out.println("first array element are: ");
		for(int x:arr1) {
			System.out.println(x+" ");
		}
		
		System.out.println("2nd array element are: ");
		for(int x:arr2) {
			System.out.println(x+" ");
		}
		
		System.out.println("merged array element are: ");
		for(int x:arr3) {
			System.out.println(x+" ");
		}
		
	}

}
