package multipledimension;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of class");
		int a = scan.nextInt();
		double[][] arr = new double[a][];

		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println("Enter the number of student in class:" + (i + 1));
			arr[i] = new double[scan.nextInt()];
		}

		// storing the content in the array
		System.out.println("Enter the Percentage");
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr.length - 1; j++) {
				arr[i][j] = scan.nextDouble();

			}
		}
		System.out.println("the percentage is are :- ");
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr.length - 1; j++) {
				System.out.println(arr[i][j]);

			}
		}
	}
}
