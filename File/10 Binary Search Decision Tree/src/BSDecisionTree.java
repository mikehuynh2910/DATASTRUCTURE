import java.io.*;

public class BSDecisionTree {
	
	private class BSTree {

	/* FIELDS */
	private int nodeID;
	private String QorA = null;   
	private BSTree yesBranch = null;
	private BSTree noBranch = null;
	
	/* CONSTRUCTOR */
	
	public BSTree(int newNodeID, String newQA) {
		nodeID = newNodeID;
		QorA = newQA;
		}
	}

		/* OTHER FIELDS */

		static BufferedReader keyboardInput = new BufferedReader(new InputStreamReader(System.in));
		BSTree rootNode = null;

		/* Default Constructor */

	public BSDecisionTree() {
		}
	
		/* CREATE ROOT NODE */

		public void createRoot(int newNodeID, String newQA) {
			rootNode = new BSTree(newNodeID,newQA);
			System.out.println("Created root node " + newNodeID);
		}

		/* ADD YES NODE */

		public void addYesNode(int ExistNodeID, int newNodeID, String newQA) {
		// If no root node do nothing

		if (rootNode == null) {
		System.out.println("ERROR: No root node!");
		return;
		}

		// Search tree

		if (searchTreeAndAddYesNode(rootNode,ExistNodeID,newNodeID,newQA)) {
		System.out.println("Added node " + newNodeID +
		" onto \"yes\" branch of node " + ExistNodeID);
		}
		else System.out.println("Node " + ExistNodeID + " not found");
		}

		/* SEARCH TREE AND ADD YES NODE */

		private boolean searchTreeAndAddYesNode(BSTree currentNode,
		int ExistNodeID, int newNodeID, String newQA) {
		if (currentNode.nodeID == ExistNodeID) {
		// Found node
		if (currentNode.yesBranch == null) currentNode.yesBranch = new
		BSTree(newNodeID,newQA);
		else {
		System.out.println("WARNING: Overwriting previous node " +
		"(id = " + currentNode.yesBranch.nodeID +
		") linked to yes branch of node " +
		ExistNodeID);
		currentNode.yesBranch = new BSTree(newNodeID,newQA);
		}
		return(true);
		}
		else {
		// Try yes branch if it exists
		if (currentNode.yesBranch != null) {
		if (searchTreeAndAddYesNode(currentNode.yesBranch,
		ExistNodeID,newNodeID,newQA)) {
		return(true);
		}
		else {
		// Try no branch if it exists
		if (currentNode.noBranch != null) {
		return(searchTreeAndAddYesNode(currentNode.noBranch,
		ExistNodeID,newNodeID,newQA));
		}
		else return(false); // Not found here
		}
		}
		return(false); // Not found here
		}
		}

		/* ADD NO NODE */

		public void addNoNode(int ExistNodeID, int newNodeID, String newQA) {
		// If no root node do nothing

		if (rootNode == null) {
		System.out.println("ERROR: No root node!");
		return;
		}

		// Search tree

		if (searchTreeAndAddNoNode(rootNode,ExistNodeID,newNodeID,newQA)) {
		System.out.println("Added node " + newNodeID +
		" onto \"no\" branch of node " + ExistNodeID);
		}
		else System.out.println("Node " + ExistNodeID + " not found");
		}

		/* SEARCH TREE AND ADD NO NODE */

		private boolean searchTreeAndAddNoNode(BSTree currentNode,
		int ExistNodeID, int newNodeID, String newQA) {
		if (currentNode.nodeID == ExistNodeID) {
		// Found node
		if (currentNode.noBranch == null) currentNode.noBranch = new
		BSTree(newNodeID,newQA);
		else {
		System.out.println("WARNING: Overwriting previous node " +
		"(id = " + currentNode.noBranch.nodeID +
		") linked to yes branch of node " +
		ExistNodeID);
		currentNode.noBranch = new BSTree(newNodeID,newQA);
		}
		return(true);
		}
		else {
		// Try yes branch if it exists
		if (currentNode.yesBranch != null) {
		if (searchTreeAndAddNoNode(currentNode.yesBranch,
		ExistNodeID,newNodeID,newQA)) {
		return(true);
		}
		else {
		// Try no branch if it exists
		if (currentNode.noBranch != null) {
		return(searchTreeAndAddNoNode(currentNode.noBranch,
		ExistNodeID,newNodeID,newQA));
		}
		else return(false); // Not found here
		}
		}
		else return(false); // Not found here
		}
		}

		public void queryBSTree() throws IOException {
		queryBSTree(rootNode);
		}

		private void queryBSTree(BSTree currentNode) throws IOException {

		// Test for leaf node (answer) and missing branches

		if (currentNode.yesBranch==null) {
			
			if (currentNode.noBranch==null) System.out.println(currentNode.QorA);
			
			else 
				System.out.println("Error: Missing \"Yes\" branch at \"" +
						currentNode.QorA + "\" question");
			return;
		}
		if (currentNode.noBranch==null) {
			System.out.println("Error: Missing \"No\" branch at \"" +
					currentNode.QorA + "\" question");
			return;
		}

		// Question

		askQuestion(currentNode);
		}

		private void askQuestion(BSTree currentNode) throws IOException {
			
			System.out.println(currentNode.QorA + " (enter \"Yes\" or \"No\")");
			String answer = keyboardInput.readLine();
			if (answer.equals("Yes")) 
				queryBSTree(currentNode.yesBranch);
			else {
			if (answer.equals("No")) 
				queryBSTree(currentNode.noBranch);
			else {
				System.out.println("ERROR: Must answer \"Yes\" or \"No\"");
				askQuestion(currentNode);
		}
		}
		}

		/* OUTPUT BIN TREE */

		public void outputBSTree() {

			outputBSTree("1",rootNode);
		}

		private void outputBSTree(String tag, BSTree currentNode) {

		// Check for empty node

			if (currentNode == null) return;

		// Output

			System.out.println("[" + tag + "] nodeID = " + currentNode.nodeID +
				", question/answer = " + currentNode.QorA);

		// Go down yes branch

			outputBSTree(tag + ".1",currentNode.yesBranch);

		// Go down no branch

			outputBSTree(tag + ".2",currentNode.noBranch);
		}
}



