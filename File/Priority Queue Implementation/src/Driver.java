
public class Driver {
	public static void main (String[] args) {

		System.out.println("Simulation of Priority Queue in JAVA");

		PriorityQueue pq= new PriorityQueue();

		pq.enqueue(1234,'B');

		pq.enqueue(6542,'B');

		pq.enqueue(9635,'B');

		pq.enqueue(7828,'D');

		pq.enqueue(9023,'D');

		pq.enqueue(2784,'D');

		pq.enqueue(4445,'D');

		pq.enqueue(8754,'A');

		pq.enqueue(9852,'A');

		pq.printValues();

		}
}
