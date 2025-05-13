package Array;

import java.util.Scanner;

public class FruitShope {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the number of fruit");
		int a=scan.nextInt();
		String []arr=new String [a];
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("enter the name of fruit"+(i+1));
			arr[i]=scan.next();
		}
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("the name of fruit is"+ (i+1) + "is : "+arr[i]);
		}
	}
}
