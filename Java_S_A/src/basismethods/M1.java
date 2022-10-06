package basismethods;

public class M1 {
	public static void main(String[] args) {

 String k1 ="INDIANCRICKET";
 String k2 = "indaincricket";
 String k3 = "MENTEAM";
 String k4 = "MEN";
 String k5 = "TEAMINDIAN";
 String k6 = "CRICKET";

 System.out.println(k1.charAt(6));
 System.out.println(k5.charAt(4));
 System.out.println(k3.replace("M", "W"));
 System.out.println(k4.isEmpty());
 System.out.println(k1.concat(k4));
 System.out.println(k2.substring(3)); //to divde thr string
 System.out.println(k1.endsWith("cket"));
 System.out.println(k1.endsWith("KET"));
 System.out.println(k5.lastIndexOf("M"));  // LEANGTH OF INDEX
 System.out.println(k5.indexOf("M"));   //LEANGTH OF INDEX
 System.out.println(k4.concat(k3));
 System.out.println(k3.contains(k4));
 System.out.println(k1==k2);
System.out.println(k1.equals(k2));	
System.out.println(k2.equalsIgnoreCase(k3));
System.out.println(k3.equalsIgnoreCase(k4));
System.out.println(k1.length());
System.out.println(k2.toUpperCase());
System.out.println(k1+" "+k5); // add with space like concat
System.out.println(k1.trim()+k2); // add without space like concat
System.out.println(k1.hashCode()); // memory address of the object
System.out.println(k2.isBlank()); // t or f 
System.out.println(k1.join(k6, k4,k5,k2));  // not cleared
//System.out.println(k1.split(k5));   // not understand
System.out.println(k1.formatted(k4));  // print first agrument
System.out.println(k1.contentEquals(k6)); // check the condition
}
 
}
