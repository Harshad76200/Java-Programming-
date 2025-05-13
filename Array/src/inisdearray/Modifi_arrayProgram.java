package inisdearray;

import java.util.Scanner;

public class Modifi_arrayProgram {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the size of array");
		int arr[]= new int [scan.nextInt()];
		
		//Storing the element array
		System.out.println("enter "+ arr.length + " enter element store inside the array ");
		for (int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		
		//replacing element divisible by 3 is -1
		for (int i=0;i<=arr.length-1;i++) {
			if(arr[i]%3==0) {
				arr[i]=-1;
			}
		}
		for(int x:arr) {
			System.out.println(x);
		}
	}
}
