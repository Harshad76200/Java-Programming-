package Array;
//single dimension array
public class Age {

	public static void main(String[] args) {
		// creation of array
		int[] a = new int[21];
		//storing the data in array
		a[0] = 21;
		a[1] = 22;
		a[2] = 34;
		a[3] = 43;
		a[4] = 44;

//		// display the array
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);
//		System.out.println(a[4]);
		
		
		// control construct are use for removing the code redundancy
		for(int i=0;i<=4;i++) {
			System.out.println(a[i]);
		}

	}

}
