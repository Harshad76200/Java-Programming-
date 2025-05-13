package Swap;

public class Swap {
	public static void main(String[] args) {
		
		//without using third variable
		
		
		int h = 10;
		int b = 15;
		
		   h = h + b;
		   b = h - b;
		   h = h - b;
		   
		   System.out.println( "this is h number "+h);
		   System.out.println( "this is b number "+b);
	}

}
