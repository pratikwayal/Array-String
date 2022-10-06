package collections_array;

import java.util.ArrayList;
import java.util.Iterator;

public class Arrayllist_int_methods {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<> ();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		System.out.println(list);
		for (int i=0 ; i<list.size();i++) {
		System.out.println( "element is "+ list.get(i));
		}
for (Integer element: list) {
	System.out.println("for each element is " + element);
}
Iterator<Integer>it = list.iterator();
while (it.hasNext())  {
	System.out.println("iteartor " +  it.next());
}
	}

} 
