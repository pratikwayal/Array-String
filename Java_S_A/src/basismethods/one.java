package basismethods;

public class one {
	public static void main (String[] args) {
		String a= "velocity";
		String b= "velocity";
		
		String c= new String ("velocity");
		String d= new String ("velocity");
		
		System.out.println(a==b);
		System.out.println(c==d);
		System.out.println(a==d);
		
		System.out.println(".............");
		b="class";
		System.out.println(b);
		System.out.println(a);
		System.out.println(a==b);
		System.out.println(".................");
		
		b="velocity";
		System.out.println(b);
		System.out.println(a);
		System.out.println(a==b);
	}
}
