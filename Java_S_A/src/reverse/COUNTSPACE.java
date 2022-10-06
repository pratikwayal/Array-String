package reverse;

public class COUNTSPACE {
public static void main(String[] args) {
	String a =" pratik  is  banker  in  jalna ";
	int count =0;
	for (int i=0;i<a.length();i++) {
		char b=a.charAt(i);
		if (b==' ') {
			count++; }
		}
	System.out.println(count);
	}
	
}

