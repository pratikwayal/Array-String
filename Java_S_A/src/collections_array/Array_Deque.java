package collections_array;

import java.util.ArrayDeque;

public class Array_Deque {

	public static void main(String[] args) {
	
		ArrayDeque<Integer> adq = new ArrayDeque<>();
		adq.offer(21);
		adq.offerFirst(32);
		adq.offerLast(35);
		adq.offer(41);
		System.out.println(adq);
		System.out.println(adq.peek());
		System.out.println(adq.peekFirst());
		System.out.println(adq.peekLast());
		System.out.println(adq.poll());
		System.out.println("poll() " + adq);
		System.out.println(adq.pollFirst());
		System.out.println("pollfirst() " + adq);
		System.out.println(adq.pollLast());
		System.out.println("polllast() " + adq);

	}

}
