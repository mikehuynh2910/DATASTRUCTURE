
public class SinglyLinkedList {
	class Node

	{

	CanHuynh data;

	Node next;

	}

	private Node head;

	private int size;

	public SinglyLinkedList() {

	head = null;

	size = 0;

	}

	public void add(CanHuynh can)

	{

	Node node = new Node();

	node.data = can;

	if(isEmpty())

	{

	head = node;

	}

	else

	{

	Node temp = head;

	if(head.next == null)

	{

	head.next = node;

	}

	else

	{

	while(temp.next != null)

	{

	temp = temp.next;

	}

	temp.next = node;

	}

	}

	size++;

	}

	public int getSize()

	{

	return size;

	}

	public boolean isEmpty()

	{

	return size==0;

	}

	public void remove(CanHuynh can)

	{

	if(!isEmpty())

	{

	if(head.data == can)

	head = head.next;

	else

	{

	Node temp = head;

	if(temp.next != null)

	{

	if(temp.next.data == can)

	{

	temp.next = temp.next.next;

	}

	}

	}

	size--;

	}

	}

	public CanHuynh peek()

	{

	if(!isEmpty())

	return head.data;

	else return null;

	}

	public void display()

	{

	Node temp = head;

	while(temp != null)

	{

	System.out.println(temp.data);

	temp = temp.next;

	}

	}

	}


	