package Number;

public class Armstrongnumber {
	public static void main(String[] args) {
		int n=153;
		int t=n;
		int sum =0;
		
		while (n>0) {
			int r=n%10;
			    n=n/10;
			    sum=sum+r*r*r;
			    
		}
		if (t==sum) 
			System.out.println(t+" is Armstrong number ");
		else 
				System.out.println(t+" is not Armstrong number");
			
	}

}
