package arrrayyy;

public class sumarray {

	public static void main(String[] args) {
		int a[] = {10,20,30,40,50,60,50,200};
		int sum =0;
		for (int i=0;i<=a.length-1;i++) {
			sum = sum+a[i];
			
		}
		System.out.println("sum of array element "+ sum);

	}

}
