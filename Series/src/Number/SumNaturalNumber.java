package Number;
// 5=> 1+2+3+4+5= 15

public class SumNaturalNumber {
	public static void main(String[] args) {
		 
		int n =5;
		int sum=0;
		
		for (int i=1;i<=n;i++) {
			sum=sum+i;
			
		}
		System.out.println("the sum of natural number : "+sum);
	}

}
