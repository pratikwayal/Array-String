package basismethods;

public class methodsone {

	public static void main(String[] args) {
		String s1 = "velocity is the best" ;   // declaration of string 
        String s2 = "VELOCITY is very bhari" ;
        String s3 = "CITY" ;
        System.out.println("...Method Opration.....");
  System.out.println(s1.charAt(7)); // to print char at inde
  System.out.println(s2.replace("V", "K")); // TO Replace char
  System.out.println(s2.isEmpty());  // its bolean cond , result in true or dlase
  System.out.println(s2.concat(s3));
  System.out.println(s3.substring(2));
  System.out.println(s2.substring(4, 6)); // doubt 
  System.out.println(s2.endsWith("ITY"));  // its bolean cond , result in true or Flase
  System.out.println(s2.lastIndexOf("L"));
System.out.println(s1.indexOf("t"));
System.out.println(s2.contains(s3)); //its bolean cond , result in true or Flase
System.out.println(s1==s2);
System.out.println(s1.equals(s3));
  System.out.println(s2.equalsIgnoreCase(s1));   
  System.out.println(s2.equalsIgnoreCase(s3));
  System.out.println(s1.length());
  System.out.println(s3.length());
  System.out.println(s3.toLowerCase());
  System.out.println(s1.toUpperCase());
  String [] M=s1.split(" ");
  for(int i=0;i<M.length;i++) {
	  System.out.println(M[i]);
  }
 

	}

}
