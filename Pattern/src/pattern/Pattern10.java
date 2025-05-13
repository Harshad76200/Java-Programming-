package pattern;
//print this pattern
//-----*****
//----*****
//---*****
//--*****
//-*****

public class Pattern10 {
	public static void main(String[] args) {
		for (int i=1; i<=5;i++) {
			for (int j=i;j<=6-1;j++) {
				System.out.print("-");
			}
			for (int j=1;j<=5;j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
	

}
