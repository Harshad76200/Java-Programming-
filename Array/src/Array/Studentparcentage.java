package Array;

import java.util.Scanner;

public class Studentparcentage {
	
	public static void main(String[] args) {
		//creation of array
	
		
		//storing the data in array
//		a[0]=78;
//		a[1]=89;
//		a[2]=98;
//		a[3]=79;
//		a[4]=70;
//		a[5]=76;
//		a[6]=86;
//		a[7]=85;
		
		Scanner scan=new Scanner(System.in);
		double[] a=new double[56];
		
		
		for (int i=0;i<=7;i++) {
			System.out.println("Enter the Student mark");
			a[i]=scan.nextDouble();
		}
		
		for(int i=0;i<=7;i++) {
			System.out.println(a[i]);
		}
		
//		int i=0;
//		while(i<-7) {
//			System.out.println(a[i]);
//			i++;
//		}
//		
//		int i=0;
//		do {
//			System.out.println(a[i]);
//		}
//		while(i<=9);
	}

}
