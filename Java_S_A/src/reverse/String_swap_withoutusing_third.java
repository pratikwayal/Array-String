package reverse;

public class String_swap_withoutusing_third {

	public static void main(String[] args) {
		String a= "Pankaj";
		String b="wayal";
//		a=a+b;

//		b=a.substring(0,a.length()-b.length());

//		a=a.substring(b.length());
//		System.out.println("Strings after swap: a = " +
//                a + " and b = " + b);
		
		String c = a;
		a=b;
		b=c;
		System.out.println("Strings after swap: a = " +
              a + " and b = " + b);

	}

}
