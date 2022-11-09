import java.util.LinkedList;

public class LLQueue {


    LinkedList<String> linkedList;  /*declares a LinkedList*/

    public LLQueue(){
        linkedList=new LinkedList<String>();    /*creates new LinkedList object*/
    }

    public void enqueue(String string){

        linkedList.add(string);    /*adds element at the end of linked list*/
    }

    public void dequeue(){

        if(linkedList.isEmpty()){   /*check if linked list is empty*/
            System.out.println("Queue is empty");
        }
        else {
            linkedList.removeFirst();    /*remove first element of linked list*/
        }
    }

    public int size(){

        return linkedList.size();    /*returns the size of linked list*/
    }

    public void printQueue(){

        for(int i=0;i< linkedList.size();i++){      /*runs the loop from i=0 to the size of linked list-1 */
            System.out.print(linkedList.get(i)+"  ");    /*prints value at ith index of linked list*/
        }
        System.out.println("\n");
    }

    public String getFront(){

        if(linkedList.isEmpty()){
            return "Queue is empty";
        }
        else {
            return linkedList.getFirst();    /*returns first element of linked list*/
        }
    }

    public String getRear(){

        if(linkedList.isEmpty()){
            return "Queue is empty";
        }
        else {
            return linkedList.getLast();    /*returns last element of linked list*/
         }
    }

    public boolean isEmpty(){

        if(linkedList.isEmpty()){     /*checks if linked list is empty*/
            return true;
        }
        else{
            return false;
        }
    }
}