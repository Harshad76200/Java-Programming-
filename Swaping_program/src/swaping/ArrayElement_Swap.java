package swaping;

import java.util.Scanner;

public class ArrayElement_Swap {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int []arr=new int [scan.nextInt()];
		
		System.out.println("enter "+arr.length+ " element");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
			
		}
		System.out.println("enter the 2 index to be swape");
		int i1=scan.nextInt();
		int i2=scan.nextInt();
		
		System.out.println("Array element before swape are :  ");
		
		for(int x:arr) {
			System.out.print(x+ "   ");
		}
		
		int temp;
		if(i1>=0 && i1<=arr.length-1 && i2>=0 && i2<=arr.length-1) {
			temp=arr[i1];
			arr[i1]=arr[i2];
			arr[i2]=temp;
			
			System.out.println("Array element after swape are :  ");
			
			for(int x:arr) {
				System.out.print(x+ "   ");
			}
			
		}
		else {
			System.out.println("enter the index between 0 to "+(arr.length-1));
		}
	}

}
