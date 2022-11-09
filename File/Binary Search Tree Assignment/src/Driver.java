
public class Driver {
	public static void main(String[] args) {

		BinarySearchTree boysNameTree = new BinarySearchTree();
		BinarySearchTree girlsNameTree = new BinarySearchTree();
		//list Boy
		boysNameTree.insert(1, "Liam");
		boysNameTree.insert(2, "Noah");
		boysNameTree.insert(3, "Mason");
		boysNameTree.insert(4, "Jacob");
		boysNameTree.insert(5, "William");
		boysNameTree.insert(6, "Ethan");
		boysNameTree.insert(7, "James");
		boysNameTree.insert(8, "Alexander");
		boysNameTree.insert(9, "Michael");
		boysNameTree.insert(10, "Benjamin");
		//printing the data in the binary tree
		System.out.println("\nData of the boys list is given below: \n");
		boysNameTree.inorderTraversal(boysNameTree.root);

		//searching the name jacob
			String check = boysNameTree.compareTo("Sang");
		
		//printing the result of search
			if(check != ""){
				System.out.println(check);
			}
			else{
			System.out.println("Not Founded Data Name");
			}
		//List Girl
		girlsNameTree.insert(1, "Emma");
		girlsNameTree.insert(2, "Olivia");
		girlsNameTree.insert(3, "Sophia");
		girlsNameTree.insert(4, "Ava");
		girlsNameTree.insert(5, "Isabella");
		girlsNameTree.insert(6, "Mia");
		girlsNameTree.insert(7, "Abigail");
		girlsNameTree.insert(8, "Emily");
		girlsNameTree.insert(9, "Charlotte");
		girlsNameTree.insert(10, "Harper");
		System.out.println("\nData of the girls list is given below: \n");
		girlsNameTree.inorderTraversal(girlsNameTree.root);
		check = girlsNameTree.compareTo("Mia");


		if(check != ""){
			System.out.println(check);
		}

		else{
			
			System.out.println("\nNot Founded Data Name");
		}
//ADD  NODE 
		System.out.println("Travel Breadth First Search : ");

		System.out.println("Breadth First Search : ");
		boysNameTree.travelBSF();
		girlsNameTree.travelBSF();
		System.out.println("Travel Depth First Search : ");
		boysNameTree.travelDSF();
		girlsNameTree.travelDSF();
////////////////////////////////////
		
	}// End main
}// End of class

