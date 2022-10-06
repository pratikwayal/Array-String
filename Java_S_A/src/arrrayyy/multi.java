package arrrayyy;

public class multi {
	
	public static void main(String[] args) {
		int ar [] []  = new int [2] [2];
		ar [0] [0]  = 100;
		ar[0][1] = 200;
		ar [1] [0] =300;
		ar[1] [1] =400;
		System.out.println(ar[0] [1]);
		for (int i=0;i<=1;i++) {
			for (int j=0;j<=1;j++) {
				System.out.print(ar [i] [j]+ " ");
			}
			System.out.println();
		}
	}

}
