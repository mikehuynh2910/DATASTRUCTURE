
public class Node {
	 int id; // id ( 4 digit integer ),

	    char priority; // Priority value

	    int priorityValue; // stored the ascii value of the priority.

	    Node next; // reference to the next node

	// constructor

	    Node(int id,char priority){

	        this.id=id;

	        this.priority=priority;

	        this.priorityValue=priority;

	        this.next=null;
}}
