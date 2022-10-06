package arrrayyy;

public class SWAPING {
public static void main(String[] args) {
	int b=45;
	int c=76;
	int a=67;
	
	System.out.println("b="+b);
	System.out.println("c="+c);
	System.out.println("a="+a);

	
	System.out.println(".....swapping.....");
	int x;
	x=b;   // back up of b in x=45
	b=c;   // 76
	
	c=a;    //67
	a=x;   //45
	System.out.println("b="+b);
	System.out.println("c="+c);
	System.out.println("a="+a);
}
}
 //x=b
//b=c
//c=a
//a=x