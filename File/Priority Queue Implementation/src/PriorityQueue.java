
public class PriorityQueue {
	 public Node ob; // single object

	    public int length=0; // tracks the length of the Queue.

	// constructor

	    PriorityQueue(){

	        this.ob=null;

	        this.length=0;
}
	    public Node creatNode(int id, char priority){

	        Node b = new Node(id,priority);

	        return b;

	}
	 
 public void enqueue(int id,char priority){ // add the node
        
	        if(this.length==0){ // checks in the queue or not.

	            ob=creatNode(id,priority);

	            this.length=1;
	        }

	        else{

	            Node r=creatNode(id,priority);             
	            Node t=this.ob; // traversing object connecting to node

	            int tlength=length; // to traverse length while insertion.

	            Node prev=null;
           
	            while( tlength > 0){

	                if((t.priorityValue < r.priorityValue) && ( t.priorityValue != r.priorityValue)){
	                	// checks the less than condition.                
	                    if(t.next==null) // if the current next node is null then the new node will be referenced by the current node

	                    {   t.next=r;

	                        tlength=0; }
	                    else // otherwise the traversing will be continued till the required condition meets
	                    {
	                        prev=t;

	                        t=t.next;
	                    }
	                }

	                else if (t.priorityValue == r.priorityValue){ // checks equal priority condition

	                   // if the current next node is not null traversing will be continued till the required condition meets

	                    if(t.next!=null){

	                        prev=t; // previous node is to keep a track on the previous node of the current traversing node

	                        t=t.next;}                   
	                    else{

	                        prev=t;

	                        t.next=r;

	                        tlength=0;
	                    }
	                }

	                else{  
	                  if(prev==null){

	                        Node temp=t;

	                        r.next=t;

	                        tlength=0;

	                        this.ob=r;  }

	                    else{

	                        r.next=t;

	                        prev.next=r;

	                        this.ob=prev;

	                        tlength=0;

	                    }                   
	                }                   
	            }
	           
	            this.length=this.length+1;    
	        }
	    }

	// Function to print the Values

	    public void printValues(){	          
	        int tlength=this.length;

	        Node temp=this.ob;

	        System.out.println("Values in the Queue");

	        System.out.println("ID,Priority");

	        while(tlength > 0){

	            System.out.println(temp.id+","+temp.priority);

	            tlength=tlength-1;

	            temp=temp.next;	           
	        }

	    }
}