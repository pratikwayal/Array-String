package basismethods;



public class arrayparctice_notpad {
	public static void main(String[] args) {
		
	
	String a= "  pratik  wayal  patil  ";
	int count= 0;
	for (int i=0;i<=a.length()-1;i++) {
	char b=a.charAt(i);
	if(b==' '){
	count++;
	}
	}
System.out.println(count);

	}}