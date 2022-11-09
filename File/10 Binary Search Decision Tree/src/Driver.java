
public class Driver {
	public static void main(String[] args) {
		BSDecisionTree tree = new BSDecisionTree();
		tree.createRoot(1, "Work to do?");
		tree.addYesNode(1, 3, "Stay in");
		tree.addNoNode(1, 2, "Out Look ?");
}
}