package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */

		Queue<String> queue = new LinkedList<>();
		queue.add("one");
		queue.add("two");
		queue.add("three");
		queue.add("four");
		System.out.println(queue);

		queue.remove("three");
		System.out.println(queue);
		System.out.println("\nremove the head(poll)\n");
		queue.poll();
		System.out.println(queue);
		System.out.println("\npeek the head of the queue\n");
		System.out.println(queue.peek());

		Queue<Integer> numlist = new LinkedList<Integer>();
		for (int j = 0; j < 15; j++) {
			numlist.add(j);
		}
		System.out.println("\nforeach\n");

		for (Integer n : numlist) {
			System.out.print(n + " ");
		}

		System.out.println("\nwhileloop\n");
		int j = 0;
		while (j < numlist.size()) {
			System.out.print(((LinkedList<Integer>) numlist).get(j) + " ");
			j++;
		}
		System.out.println("\nIterator\n");
		Iterator iterator = numlist.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}

}
