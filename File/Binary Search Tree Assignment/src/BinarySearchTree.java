import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinarySearchTree {
	//root of binary tree
	public Node root;
	// BST connstructor 
	public BinarySearchTree(){
		
		root = null;
	}

	//insert() add new node 
	public void insert(int data, String name) {
	//Create a new node
		Node newNode = new Node(data, name);

	//Check whether tree is empty
		if(root == null){
			root = newNode;
			return;
	}
		else {
		//current node point to root of the tree
			Node current = root;
			Node parent = null;
	
			while(true) {
			//parent keep track of the parent node of current node.
				parent = current;
		
			//If data is less than current's data, node will be inserted to the left of tree
				if(name.compareTo(current.sData) < 0) {
					
					current = current.left;
				if(current == null) {
					parent.left = newNode;
					return;
				}
				}
			//If data is greater than current's data, node will be inserted to the right of tree
				else {
					current = current.right;
					if(current == null) {
						parent.right = newNode;
						return;
						}
				}
			}
		}
	}//End method Insert

	//function to print the data in the BST in INorder
	public void inorderTraversal(Node node) {

		//Check whether tree is empty
		if(root == null){
			System.out.println("Tree is empty");
			return;
		}
		else{
	
			if(node.left!= null)
				inorderTraversal(node.left);
				System.out.println(node.sData + " " + node.iData);
				if(node.right!= null)
				inorderTraversal(node.right);
			}
	}// End method Inorder

	public String compareTo(String name){
		
		String check = "";
		if(root == null) {
			System.out.println("Tree is empty");
			return check;
		}

		else {
			Node node = root;
		
			while (node != null){
				
				if(name.compareTo(node.sData) < 0)
					node = node.left;
		
				else if(name.compareTo(node.sData) > 0)
					node = node.right;
		
				else{
					check = "\n Found Data \n" + node.sData + ": rank " + String.valueOf(node.iData);
					break;
				}
			}
		return check;
	   }
   }//End method CompareTo
	//Queue
	
	
	//Depth first Search or Depth first traversal is a recursive algorithm for searching all the vertices of a graph or tree data structure. 
	//Traversal means visiting all the nodes of a graph.
	public void travelDSF(){
		
			travelDSF(root);
			System.out.println();
		}
	public void travelDSF(Node root){
		Stack<Node> s = new Stack<Node>();
		s.add(root);
		while (s.isEmpty() == false) {
			Node x = s.pop();
			if(x.right!=null) s.add(x.right);
			if(x.left!=null) s.add(x.left);			
			System.out.print(" " + x.iData+": "+x.sData );
		}
	}

	/*	if(root==null){
			return;
		}
			System.out.print(root.sData+" ");
			travelDSF(root.left);
			travelDSF(root.right);
		}*/
//Breadth-first search (BFS) is an algorithm that is used to graph data or searching tree or traversing structures. The full form of BFS is the Breadth-first search.


	public void travelBSF(){
		
			travelBSF(root);
			System.out.println();
		}
	void travelBSF(Node root){
		
		if(root==null){
			return ;
		}
		
		Queue<Node> queue=new LinkedList<Node>();
		queue.add(root);
		
		while(!queue.isEmpty()){
			Node temp=queue.remove();
			System.out.print(temp.sData+" ");
			if(temp.left!=null){
				queue.add(temp.left);
			}
			if(temp.right!=null){
				queue.add(temp.right);
			}
		
		}

	}
}// End of class
