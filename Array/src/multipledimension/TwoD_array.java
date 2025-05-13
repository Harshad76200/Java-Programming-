package multipledimension;

public class TwoD_array {
	public static void main(String[] args) {
		int [][] a=new int [2][4];
		a[0][0]=78;
		a[0][1]=76;
		a[0][2]=75;
//		a[0][3]=73;
		
		a[1][0]=89;
		a[1][1]=87;
		a[1][2]=67;
//		a[1][3]=90;
		
//		a[2][0]=69;
//		a[2][1]=57;
//		a[2][2]=47;
//		a[2][3]=30;
		
		for(int i=0;i<=1;i++) {
			for(int j=0;j<=2;j++) {
				System.out.println(a[i][j]);
			}
		}
		
	}

}
