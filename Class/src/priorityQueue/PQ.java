package priorityQueue;

import java.util.PriorityQueue;

public class PQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(3);
		pq.add(4);
		pq.add(1);
		pq.add(9);
		pq.add(7);
		pq.add(2);
		System.out.println(pq.peek());//by default min priority quue
		System.out.println(pq.poll());
		System.out.println(pq.isEmpty());
		System.out.println(pq.size());
		System.out.println(pq.poll());
	}

}
