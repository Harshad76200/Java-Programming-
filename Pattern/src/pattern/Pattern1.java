package pattern;

import java.util.Scanner;

// wajp to print this pattern , give the usser input  (*)
public class Pattern1 {
 public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter a character");
	char ch = scan.next().charAt(0);
	System.out.println(ch);
}
}
