package loop;

public class Table1to100 {
	public static void main(String[] args) {
		int a =100;
		for (int i=1; i<=a;i++) {
			System.out.print("table of "+ i+": ");
			for(int j=1; j<=10;j++) {
				System.out.print(i*j +" ");
			}
			System.out.println();
		}
	}

}
