package collections_array;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashset {

	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<> ();
		set.add(12);
		set.add(21);
		set.add(19);
		set.add(34);
		set.add(2);
		set.add(34);
		set.add(21);
		System.out.println(set);   // inseration order  follow
		set.remove(34);
		set.remove(21);
		System.out.println(set);
		System.out.println(set.contains(34));
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		set.clear();
		System.out.println(set);


	}

}
