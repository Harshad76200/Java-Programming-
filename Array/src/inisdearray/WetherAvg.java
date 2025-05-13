package inisdearray;

import java.util.Scanner;

public class WetherAvg {
	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);
		
		int arr[]=new int [7];
		System.out.println("enter the tem of 7 days");
		for (int i=0;i<=arr.length-1;i++){
			arr[i]=scan.nextInt();
		}
		
		int sum=0;
		for(int i=0;i<=arr.length-1;i++) {
			sum+=arr[i];
		}
		
		int avg=sum/7;
		System.out.println("the tem avg is : "+avg);
	}
}
