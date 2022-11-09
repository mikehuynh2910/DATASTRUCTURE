
public class Node {
	String sData; // represents name
	int iData;    // represents place on top ten list
	Node left;    // left child (left subtree)
	Node right;   // right child (right subtree

	
	public Node(int data, String name){
		//Assign data to the new node, set left and right children to null
		this.iData = data;
		this.sData = name;
		this.left = null;
		this.right = null;
		}
}
