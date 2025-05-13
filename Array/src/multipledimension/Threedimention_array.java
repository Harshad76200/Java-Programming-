package multipledimension;

import java.util.Scanner;

public class Threedimention_array {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//creation of 3d array
		int [][][]arr=new int [2][3][5];
		
		//store the  ages in array
		for (int i=0;i<=arr.length-1;i++) { // college
			for (int j=0;j<=arr[i].length-1;j++) { //class
				for (int k=0;k<=arr[i][j].length-1;k++) {  //student
					System.out.println("enter age for college "+(i+1)+" class "+(j+1)+" student "+(k+1));
					arr[i][j][k]=scan.nextInt();
				}
			}
		}
		
		//display of data 
		for (int i=0;i<=arr.length-1;i++) {
			for (int j=0;j<=arr[i].length-1;j++) {
				for (int k=0;k<=arr[i][j].length-1;k++) {
					System.out.println("the college "+(i+1)+" class "+(j+1)+" Student "+(k+1)+" is : "+  arr[i][j][k]);
				
				}
				
			}
				
		}
	}
}
