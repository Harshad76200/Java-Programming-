package multipledimension;

import java.util.Scanner;

public class TwoDarray1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//Ask the no. of com and no. of emp from user
		System.out.println("enter the no. of comp");
		int com =scan.nextInt();
		System.out.println("enter the no of emp");
		int emp=scan.nextInt();
		
		//creating the array
		String [][] arr=new String [com][emp];
		
		//storing the contents in the array
		for (int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1 ;j++) {
				System.out.println("enter the name of com "+(i+1)+"emp"+(j+1));
				arr[i][j]=scan.next();
			}
		}
		
		//Display the contents
        for(int i=0;i<=arr.length-1;i++) {
        	for(int j=0;j<=arr[i].length-1;j++) {
        		System.out.println("the com name "+(i+1)+"emp "+(j+1)+"is : "+ arr[i][j]);
        	}
        	
        	
        }
	}
}
