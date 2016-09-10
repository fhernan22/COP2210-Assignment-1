package programmingassignment1;

import java.util.Random;

public class LotteryTicket {
    private int[] ticket;
    
    Random numGenerator = new Random();
    
    // Helper method that checks for duplicate numbers in ticket array
    private boolean hasDuplicate(int[] ticket, int number)
    {
        for (int i=0; i<ticket.length; i++)
        {
            if (ticket[i] == number)
                return true;
        }
        
        return false;
            
    }
    
    // Create a lottery ticket
        // If ticketType is 5 the ticket being created is fantasy 5 so 
        // ticket array must be of size 5
        
        // else if ticketType is 6 a lotto ticket is being created so
        // ticket array must be of size 6
    public void createTicket(int ticketType)
    {
        ticket = new int[ticketType];
        
        int numRange = 0;   //Upper limit of possible random numbers
        
        
        //Numrange will be either 36 or 53 depending on the ticket type
        //being created
        if (ticketType == 5)
            numRange = 36;
        else
            numRange = 53;
        
        for (int i=0; i<ticket.length; i++)
        {
            int number = 1 + numGenerator.nextInt(numRange);
            
            // if number generated already exist keep generating a new one
            while (hasDuplicate(ticket, number))
            {
                number = 1 + numGenerator.nextInt(numRange);
            }
            
            // if number doesn't exist add it to ticket array
            ticket[i] = number;
        }
    }
    
    // Prints all numbers in a ticket
    
    public void showNumbers()
    {
        for (int i=0; i<ticket.length; i++)
        {
            System.out.print(ticket[i] + " ");
        }
    }
}
