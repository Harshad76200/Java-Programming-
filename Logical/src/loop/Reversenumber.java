package loop;

public class Reversenumber {
	public static void main(String[] args) {
		int h =12134;
		int rev=0;
		
		while(h>0) {
			int b=h%10;
			h=h/10;
			rev= rev*10+b;
		}
		System.out.println(rev);
	}

}
