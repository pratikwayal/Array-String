package reverse;

public class pallindrome {
public static void main(String[] args) {
	String a= "MADAM";
	String rev= "";
	for(int i=a.length()-1;i>=0;i--) {
		rev = rev + a.charAt(i);
	}
	System.out.println(rev);
	if (a.equals(rev)) {
		System.out.println("Given String Is Pallindrome");
	}
	else {
	System.out.println("Given String NOT Is Pallindrome");
}
}
}