package collections_array;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMap_l {

	public static void main(String[] args) {
   // Map<String,Integer> numbers = new HashMap<> ();
		Map<String,Integer> numbers = new TreeMap<> (); // sorted order in alphabetic
    numbers.put("one", 1);  // keys are unique 
    numbers.put("two", 2);
    numbers.put("three", 3);
    numbers.put("four", 4);
    
    System.out.println(numbers);
    
    if(!numbers.containsKey("one")) {
    	numbers.put("one", 11);
    	
    }
    System.out.println(numbers);
    if(!numbers.containsKey("six")) {
    	numbers.put("six", 66);
    	
    }
    System.out.println(numbers);
for (Map.Entry<String, Integer> e: numbers.entrySet() ) {
	System.out.println(e);
	//System.out.println(e.getKey());
	//System.out.println(e.getValue());
	
}
	}

}
