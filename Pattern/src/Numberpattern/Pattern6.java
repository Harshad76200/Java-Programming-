package Numberpattern;
//
//16 15 14 13 
//12 11 10 09 
//08 07 06 05 
//04 03 02 01 

public class Pattern6 {
	public static void main(String[] args) {
		int count=16;
		for (int i=1;i<=4;i++) {
			
			for (int j=1;j<=4;j++) {
				
				if(count<=9) {
				System.out.print("0"+count+" ");
				count--;
				
				}
				else {
					System.out.print(count+" ");
					count--;
				}
			}
			System.out.println();
		}
	}

}