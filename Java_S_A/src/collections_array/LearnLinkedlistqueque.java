package collections_array;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedlistqueque {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(23);
		queue.offer(24);
		queue.offer(34);
		queue.offer(43);
		System.out.println(queue);
		
		System.out.println(queue.poll());
		System.out.println(queue);

		System.out.println(queue.peek());
		
	}

}
