package reverse;

public class R1 {
public static void main(String[] args) {
	String a="PRATIK WAYAL";
	String rev = "";
	for (int i=a.length()-1;i>=0;i--) {
		rev = rev + a.charAt(i) ;
	}
	System.out.println(rev);
}
}
