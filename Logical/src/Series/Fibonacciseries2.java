package Series;

public class Fibonacciseries2 {
	public static void main(String[] args) {
		int n=10;
		int a=0,b=1;
		System.out.println(a+" "+b);
		for (int i=3;i<=n;i++) {
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}

