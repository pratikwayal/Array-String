package arrrayyy;

import java.util.Arrays;

public class assigment1_6 {
public static void main(String[] args) {
	int [] a = {10,30,40,20,90,80,100,70,60,50};
	System.out.println("Length of array is: "+a.length);
	Arrays.sort(a);
	System.out.println("Ascending_forloop");
	for (int i=0;i<=a.length-1;i++) {
		System.out.print(a[i]+",");
	}
	System.out.println("\nDecending_forloop");
	for (int i=a.length-1;i>=0;i--) {
		System.out.print(a[i]+",");
	}
	System.out.println("\nAscending_whileloop");
	int j=0;
	while (j<=a.length-1) {
		System.out.print(a[j]+",");
		j++;
	}
	System.out.println("\nDcending_whileloop");
	int k=a.length-1;
	while(k>=0) {
		System.out.print(a[k]+",");
		k--;
		
	}
	Arrays.sort(a);
	System.out.println("\nsecond highest number from array:"+a[a.length-2]);
	System.out.println("second lowset number from array:"+a[1]);
}
}
