package multipledimension;

import java.util.Scanner;

public class TwoD1 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the no of class");
		//creating  the row of array
		String [][]arr=new String [scan.nextInt()][];
		//creating the columns of each row
		for (int i=0;i<=arr.length-1;i++) {
			
			System.out.println("enter the no of student class "+(i+1));
			arr[i]=new String [scan.nextInt()];
		}
		//storing the data in the array
		for (int i=0;i<=arr.length-1;i++) {
			for(int j=1;j<=arr[i].length-1;j++) {
				System.out.println("whether class "+(i+1)+ "student "+(j+1)+"has complete thee project");
				//taking the boolean value as user input 
				boolean status =scan.nextBoolean();
				//checking whether user has entered true
				if(status==true) {
					arr[i][j]="yes";
					
				}
				//otherwise store no
				else {
					arr[i][j]="no";
				}
			}
		}
		// displaying the data in the array 
		for (int i=0;i<=arr.length-1;i++) {
			for(int j=1;j<=arr[i].length-1;j++) {
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
