package reverse;

public class remove_duplicate_string {

	public static void main(String[] args) {
		String a = "world world";
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < a.length(); i++) {
			if (builder.indexOf(String.valueOf(a.charAt(i))) == -1) {
				builder.append(a.charAt(i));
			}
	}
		System.out.println("Original String : " + a);
		System.out.println("After removing the duplicates : " + builder.toString());
	}}
