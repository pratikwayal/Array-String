package arrrayyy;

//Java Program to illustrate the use of declaration, instantiation   
//and initialization of Java array in a single line


public class array4singleline {
public static void main(String[] args) {
int arr[] = {30,3,40,50,56,53,6,8,9};  // declaration, instantiation and initialization 
	//for (int i=0;i<a.length;i++) {  // printing array
		//System.out.println(a[i]);
	for (int i:arr)   // printing array using for each loop
		System.out.println(i);
}
}
