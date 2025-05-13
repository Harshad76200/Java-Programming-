package inisdearray;

public class Program1 {
	public static void main(String[] args) {
		int [] arr = {10,20,30,40,50};
		
		for (int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]+"  ");
		}
		
		for(int x:arr) {
			System.out.println(x);
		}
		
		int res=1;
		for(int x:arr) {
			res=res*x;		
		}
		System.out.println("this is multiplication "+res);
		
//		note:--
//		ways of creating array
//		one D array
//		1d
//		int arr[]=new int [3];
//		arr[0]=10;
//		arr[1]=20;
//		arr[2]=30;
//		
//		2d way
//		int arr[]= {20,10,30};
//		
//		3rd way
//		int arr[]=new int[] {10,20,30,40};
		
//		Two D array creation way
//		int arr[][]=new int [2][3];
//		
//		2nd
//		int arr[][]= {{10,20,30},{40,50,60}};
	}
	

}
