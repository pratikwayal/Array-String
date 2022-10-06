package arrrayyy;

public class tofindduplicate {

	public static void main(String[] args) {
		int [] a = new int [] {1,2,3,4,5,2,7,8,4,3,8,};
		System.out.println("duplicate array");
		
		for (int i=0;i<=a.length-1;i++) {
			for (int j=i+1;j<=a.length-1;j++) {
				if (a[i]==a[j]) {
					System.out.println(a[j]);
				}
			}
		}
	}
}
