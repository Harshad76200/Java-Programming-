package Series;

public class Fibonacciseries {
	public static void main(String[] args) {
		
		int h=0,b=1,c;
		
		for (int i =2 ;i<=20; i++) {
			
			System.out.println(h+"+"+b);
			c=h+b;
			System.out.println("="+c);
			h=b;
			b=c;
			
		}
		
	}

}
