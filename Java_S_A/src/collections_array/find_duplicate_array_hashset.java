package collections_array;

import java.util.HashSet;
import java.util.Set;

public class find_duplicate_array_hashset {

	public static void main(String[] args) {
		int [] a = new int [] {1,2,3,4,5,2,7,8,4,3,8,};
		Set <Integer> Set = new HashSet<Integer>();
		for (int i=0; i<a.length;i++) {
			if (Set.add(a[i])==false) {
				System.out.println("Duplicate elements found:" +a[i]);
				
			}
		}


	}

}
