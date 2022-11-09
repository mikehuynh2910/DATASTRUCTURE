
public class Driver {
	public static void main(String[] args) {
		ListHuynh<Integer> myList = new ListHuynh<>(10);
        try {
            myList.remove(0);
        } catch (ArrayEmptyException e) {
            System.out.println("Trying to remove an element from an empty array. Exception: " + e);
        }
        try {
            for (int i = 0; i < 11; i++) {
            	// add list
                myList.add(i);
            }
        } catch (ArrayFullException e) {
            System.out.println("Trying to add an element to a full array. Exception: " + e);
        }
        //print list
        System.out.println("The list is: ");
        myList.print();
        System.out.println("The size of the list is: " + myList.size());//list size
        System.out.println("Removing elements :1, 2, 4, 6....");
        try {
        	//remove
            myList.remove(2);
            myList.remove(1);
            myList.remove(4);
            myList.remove(6);
        } catch (ArrayEmptyException e) {
            System.out.println("Trying to remove an element from an empty array. Exception: " + e);
        }
        System.out.println("Now, the list is: ");
        myList.print();//list after removing
    }
}
