
public class QueueProgramHuynh  
{
	public static void main(String arg[])

    {

        // test 10 100 1000

        int ticketNumber [] = {10, 100, 1000};

        QueueServiceHuynh dr = null;

        for(int j : ticketNumber )

        {
        	System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("Service for " + j + " tickets");

            dr = new QueueServiceHuynh(j);

            dr.DistributeTicket();

            System.out.println();

        }

    }
}
