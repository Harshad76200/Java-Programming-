package pattern;
//to print this pattern
//-----*
//----**
//---***
//--****
//-*****
public class Pattern12 {
	public static void main(String[] args) {
		for (int i=1; i<=5;i++) {
			for (int j=1;j<=6-i;j++) {
				System.out.print("-");
			}
			for (int j=1;j<=i;j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
	

}