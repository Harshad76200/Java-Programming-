package loop;

//import java.util.Scanner;

public class Evenodd {
	public static void main(String[] args) {
		//Scanner s = new Scanner(System.in);
		//System.out.println("enter a number");
		//int a =s.nextInt();
		
		for (int i=1 ; i<=100; i++) {
			if (i%2==0) {
				System.out.println(i+ " is even");
			}
			else {
				System.out.println(i + " is odd");
			}
		}
	}

}
