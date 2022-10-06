package arrrayyy;

public class Max_Min_Elements_in_Array {

	public static void main(String[] args) {
		
int a[] = {74,20,30,40,50,60,70,78,79,80 } ;
int max = a[0];
for (int i=1 ;i<a.length;i++) {
	if (a[i] > max) {
		max=a[i];	
	}	
}
System.out.println("Maximum element of array is:" +max);
 int min=a[0];
 for (int i=1;i<a.length;i++) {
	 if (a[i] < min) {
		 min=a[i]; 
	 }
 }
 System.out.println("Minimum element of array is: " +min);
	}
}
