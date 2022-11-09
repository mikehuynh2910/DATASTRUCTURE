package QueueLab;

/**
 * Queue Lab, 
 * SangHuynh CIS152
 */
public class queue {
// Members
	private int head; //  it will point to the front element of the queue
	private int tail; // it will point to the rear element of the queue i.e enqueue operation is performed to this index
	private int size; // it will tell that how many elements that are present in the queue
	private int maxSize; //  it will tell that what is the capacity of the queue
	private String queueItems[];

	public queue() {
		this.maxSize = 5;
		this.size = 0;
		this.head = -1;
		this.tail = -1;
		this.queueItems = new String[maxSize];
	}

	/**
	 * @param maxSize - sets maximum size of the queue
	 */
	public queue(int maxSize) {
		this.maxSize = maxSize;
		this.size = 0;
		this.head = -1;
		this.tail = -1;
		this.queueItems = new String[maxSize];
	}

	/**
	 * @return If queue is full
	 */
	public boolean isFull() {
		  if(size==maxSize)
		  return true;	
		  return false; 
	}

	/**
	 * @return If queue is empty
	 */
	public boolean isEmpty() {
		 if(size==0)
	      return true;
		return false; 
	}

	/**
	 * @return Returns number of elements in the queue
	 */
	public int size() {
		return size; 
		
	}

	/**
	 * @return Returns element at head of queue
	 * @throws StackEmptyException
	 */
	public String peek() throws QueueEmptyException {
		String item = null;
		  if(isEmpty()) // if queue is empty then throw an exception
		       throw new QueueEmptyException();
		   // if queue is not empty return the value pointed by head
		   item=this.queueItems[this.head];
		return item; // Possibly you will remove this line, this is for running Unit Tests before
// writing code
	}

	/**
	 * @return Removes and returns element at head of queue
	 * @throws QueueEmptyException
	 */
	public String dequeue() throws QueueEmptyException {
		String item = null;
		if(isEmpty()) // if queue is empty then throw an exception
		       throw new QueueEmptyException();
		   item=this.queueItems[head];
		   for(int i=head;i<tail;i++)
		   {
		       queueItems[i]=queueItems[i+1];
		   }
		   // decrease the size by 1 and also tail;
		   size--;
		   tail--;
		   if(tail==-1) // when there is one element and that has been deleted
		       head=-1;
		   return item; 
		   }
	

	/**
	 * Adds item to tail of the queue
	 * 
	 * @param item
	 * @throws QueueFullException
	 */
	public void enqueue(String item) throws QueueFullException {
		 if(isFull())
	       {
	           throw new QueueFullException();
	       }
	       if(size==0) // if queue is initially empty then initialize head as 0
	       {
	           head=0;
	             
	       }
	       tail++; // increament the tail index to insert at that point and also increament the size by 1
	       size++;
	       queueItems[tail]=item;
	   }
	

	/**
	 * @return Returns list of queue items from head to tail one per line (eg Item1
	 *         Item2 Item3 ...) if queue is empty returns "Queue is Empty"
	 */
	public String printQueue()throws QueueEmptyException {
		   if(isEmpty()) // if queue is empty then throw an exception
		       throw new QueueEmptyException();
		String queueString = new String();

		 for(int i=head;i<=this.tail;i++)
		   {
		       queueString+=queueItems[i]+"\n";
		   }
		return queueString; 
	}
}