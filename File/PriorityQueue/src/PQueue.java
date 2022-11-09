import java.util.*;
public class PQueue {
	        public static void main (String[] args) {
	        // Size  
	        int n = 100; 
	        ArrayList<Integer> alist  = new ArrayList<Integer>(n); 
	        // Appending new elements at 
	        // the end of the list 
	        	for (int i = 1; i <= n; i++) 
	        	alist.add(i); 
	        // creating a priority queue
	        PriorityQueue<Integer> PQ = new PriorityQueue<>(); 
	        Random rand = new Random();  // using random function to generate priority from 0-5
                for(int i=0; i<100; i++){
                    int id = rand.nextInt(5)+1	;
                    PQ.add(id);
	            }
	            // printing the list and the queue
	      System.out.println("List:");
	      System.out.println(alist);
	      System.out.println();
	      System.out.println("Queue:");
	            System.out.println(PQ);
	        }
}
