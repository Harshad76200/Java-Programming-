package loop;

public class Digitseprating  {
 public static void main(String[] args) {
	 // revers digit seprating .
 int n=125653568;
// int sum=0;
 while(n>0) {
	 int r=n%10;
	// sum=sum+r;
	 n=n/10;
	System.out.println(r);
	
 }
// System.out.println(sum);
}
}
