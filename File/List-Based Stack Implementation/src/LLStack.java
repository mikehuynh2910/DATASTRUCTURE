	import java.util.*;

public class LLStack {

	//StackUsingLinkedList is the class which uses LinkedList for stack implementation

	//LinkedList of String Object
	   LinkedList<String> ll;
	   public LLStack() {
	       ll = new LinkedList<>();
	   }
	//add the string object to top of the stack
	   public void push(String nodeValue) {
	       ll.addFirst(nodeValue);
	   }
	//checks if the stack is empty
	   public boolean isEmpty() {
	       if (ll.size() == 0) {
	           return true;
	       }
	       return false;
	   }
	//prints the top of the stack and also removes it
	   public void pop() {
	       if (ll.size()==0) {
	           System.out.println("stack is empty");
	       }
	       else {
	           System.out.println(ll.getFirst());
	           ll.removeFirst();
	       }
	   }
	//returns the top of the stack value
	   public String peek() {
	       if (ll.size()==0) {
	           System.out.println("stack is empty");
	           return "";
	       }
	       else {
	           return ll.getFirst();
	       }
	   }
	//deletes the stack
	   public void deleteStack() {
	       ll.clear();
	   }
	//prints the size of stack
	   public int size() {
	       return ll.size();
	   }

	//displays the stack from top to bottom
	   public void printStackDown()
	   {
	       // check for stack underflow
	       if (ll.size() == 0) {
	           System.out.println("No data in the stack");
	       }
	       else {
	           for (int i = 0; i < ll.size(); i++) {       
	System.out.println(ll.get(i) + " ");
	}
	       }
	   }
	}

