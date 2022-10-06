package collections_array;

import java.util.ArrayList;

public class LearnArrayList {

	public static void main(String[] args) {
		ArrayList<String> SN = new ArrayList<>();
		SN.add("pratik");
		SN.add("PRatik");
	    SN.add("pankaj");
	    SN.add("MAYUR");
	    SN.add("tEJ");
	    System.out.println(SN);
	    SN.add("DIH");
	    System.out.println(SN);
SN.add(2, "RAJE");
System.out.println(SN);

System.out.println(SN.get(3));  // GET ELEMENT
SN.remove(2);   // remove

SN.set(1, "WAYAL");
System.out.println(SN);

System.out.println(SN.contains("RAJE"));

SN.clear(); // Clear all the list
System.out.println(SN);



	}

}
