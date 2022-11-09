
public class ListHuynh<E> {
	private static final int DEFAULT_CAPACITY = 10;

    private int theSize;
    private E[] theItems;

    public ListHuynh(int capacity) {
        theSize = 0;
        theItems = (E[]) new Object[capacity];
    }
        //side
        public int  size() {
            return theSize;
    }
    	//Empty
    public boolean isEmpty() {
        return size() == 0;
    }
    	//get
    public E get(int index) {
        if (index < 0 || index >= size()) throw new ArrayIndexOutOfBoundsException();

        return theItems[index];
    }
    public E set(int index, E newVal) {
        if (index < 0 || index >= size()) throw new ArrayIndexOutOfBoundsException();
        E old = theItems[index];
        theItems[index] = newVal;
        return old;
    }
    	//add
    public boolean add(E element) throws ArrayFullException {
        add(size(), element);
        return true;
    }
   // Full
    public void add(int index, E element) throws ArrayFullException {
        if (theItems.length == size()) {
            throw new ArrayFullException("Array is already full, cannot insert the element: " + element);
        }
        for (int i = theSize; i > index; i--) {
            theItems[i] = theItems[i - 1];
        }
        theItems[index] = element;
        theSize++;
        
    }
    //Empty
        public E remove(int index) throws ArrayEmptyException {
            if (isEmpty()) {
                throw new ArrayEmptyException("Array is empty, cannot remove the element from index: " + index);
            }
            if (index < 0 || index >= size()) {
                throw new ArrayIndexOutOfBoundsException();
            }
            E removeItem = theItems[index];
            for (int i = index; i < size() - 1; i++) {
                theItems[i] = theItems[i + 1];
            }
            theSize--;
            return removeItem;
        }

        public void print() {
            for (int i=0; i<theSize; i++) {
                System.out.print(theItems[i] + " ");
            }
            System.out.println();
       
    
}
    	//
    
}
