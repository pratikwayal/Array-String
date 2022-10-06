package reverse;

public class sum_of_string {

	public static void main(String[] args) {
		int num = 123456;
		int sum = 0;
		while (num > 0) {
			sum = sum + num % 10; // sum value is 5 5+4+3+2+1
			num = num / 10; // 1234 123 12 1
		}
		System.out.println("sum of digits in number:" + sum);
	}

}
