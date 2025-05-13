package Number;

public class Fibonacisiries {

	public static void main(String[] args) {
		
		int n=12;
		
		int fib1=0;
		int fib2=1;
		int fib3;
		
		if (n==1) {
			System.out.println(fib1);
		}
		else if(n==2) {
			System.out.println(fib1+"  "+fib2);
			
		}
		else {
			System.out.print(fib1+"  "+fib2+" ");
			
			for (int i=3;i<=n;i++) {
				fib3=fib1+fib2;
				System.out.println(fib3+" ");
				fib1=fib2;
				fib2=fib3;
				
			}
		}
		
	}
}
