package collections_array;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Learn_priority_qeeue {

	public static void main(String[] args) {
//		PriorityQueue<Integer>pq = new PriorityQueue<>();
//		pq.offer(107);
//		pq.offer(21);
//		pq.offer(302);
//		pq.offer(41);
//		pq.offer(51);
//		System.out.println(pq);
//		pq.poll();
//		System.out.println(pq);  // oder is not mentioned ...minheap
//
//		System.out.println(pq.peek());
		PriorityQueue<Integer>pq = new PriorityQueue<>(Comparator.reverseOrder());
		pq.offer(107);
		pq.offer(21);
		pq.offer(302);
		pq.offer(41);
		pq.offer(51);
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);  // oder is not mentioned ...minheap

		System.out.println(pq.peek());

	}

}
