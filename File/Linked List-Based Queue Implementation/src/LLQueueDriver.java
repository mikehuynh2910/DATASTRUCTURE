import java.util.Scanner;

public class LLQueueDriver {

   public static void main(String[] args){

       LLQueue llqueue=new LLQueue();
       int choice;
       do {
           System.out.println("Enter \n 1.Insert \n 2.Remove \n 3.Print all elements\n 4.Print front element \n 5.Pri" +
                   "nt rear element\n 6.Check if queue is empty \n 7.Get size of queue \n 8.Quit");

           Scanner scanner = new Scanner(System.in);

           choice = Integer.parseInt(scanner.nextLine());
           if (choice == 1) {
               System.out.println("Enter the String:");
               llqueue.enqueue(scanner.nextLine());
           }else if (choice == 2) {
               llqueue.dequeue();
           }else if (choice == 3) {
               llqueue.printQueue();
           }else if (choice == 4) {
               System.out.println(llqueue.getFront());
           }else if (choice == 5) {
               System.out.println(llqueue.getRear());
           }else if (choice == 6) {
               if (llqueue.isEmpty()) {
                   System.out.println("Queue is empty");
               } else {
                   System.out.println("Queue is not empty");
               }
           }
           else if (choice == 7) {
               System.out.println(llqueue.size());
           }
          }while(choice!=8);
   }
}