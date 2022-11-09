import java.util.*;

public class QueueServiceHuynh {
	//queue for the people

    Queue <Integer> Queue = null;

    //constructor for assigning no. of people

    public QueueServiceHuynh(int n)

    {

    	Queue = new LinkedList<Integer>();

        for(int i=1;i<=n;i++)

        	Queue.add(i);
    }
    public void DistributeTicket()

    {

        int customer = 1 + (int)(Math.random()*1000);

        System.out.println("No. of Users :" + customer);

        System.out.println("User(n)\tTotal ticket Received");

        for(int cus = 1; cus <= customer; cus++)

        {

            //Decide customer n will can take 1-4 ticket

            int totalTicket = 1 + (int)(Math.random()*4);

            boolean ticketReceived = takeTicket(totalTicket);

            if(ticketReceived)

            {//3 tickets sold to customer 5
            	System.out.println(totalTicket+" Ticket sold to customer :"+cus);

            }

            else

            {

                System.out.println("Total " + (customer-cus+1) + " user(s) have not ticket(s)");

                break;

            }

                

        }

    }
    public boolean takeTicket(int n)

    {

        int ticketLeft = Queue.size();

        if(ticketLeft >= n)

        {

            for(int i=0;i<n;i++)

            {

            	Queue.remove();

            }

            return true;

        }

        else

        {

            System.out.println("Not enough tickets to distribute to customer");

            return false;

        }

    }

}


