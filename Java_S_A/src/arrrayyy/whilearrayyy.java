package arrrayyy;

import java.util.Arrays;

public class whilearrayyy {
	public static void main(String[] args) {
		int ar [] = {50,20,10,40,30};
	
	Arrays.sort(ar);
	int i=0;
	
	while (i<=ar.length-1) {
		System.out.println( ar[i]+" ");
		i++;
	}
	
System.out.println("....decen...while....");
int h=ar.length-1;
while (h>=0) {
	System.out.println(ar[h]+" ");
	h--;
}


	}}
