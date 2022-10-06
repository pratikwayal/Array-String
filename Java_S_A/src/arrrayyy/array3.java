package arrrayyy;

import java.util.Arrays;

public class array3 {
public static void main(String[] args) {
	int ar [] = {50,20,10,40,30};
	System.out.println("......original info from array.........");
	
	for (int i=0;i<=4;i++) { 
	System.out.println(ar[i]);
	
}
Arrays.sort(ar);
	
System.out.println(".....assecending........");

for (int i=0;i<=ar.length-1;i++) {
	System.out.println(ar[i]);
}
System.out.println(".....decending......");
for (int i=ar.length-1;i>=0;i--) {
	System.out.println(ar[i]);
}
}
}
