
package programmingassignment1;

import java.util.Scanner;

public class ProgrammingAssignment1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    // Create Scanner Object
        
        LotteryTicket lottoTicket = new LotteryTicket();    // Lotto ticket
        LotteryTicket fantasyTicket = new LotteryTicket();  // Fantasy 5 ticket
        
        lottoTicket.createTicket(6);
        fantasyTicket.createTicket(5);
        
        System.out.println("If you want to see the lotto winning numbers " +
                           "type lotto");
        System.out.println("If you want to see the fantasy five winning numbers " +
                           "type fantasy");
        System.out.print("If you want to see both type both: ");
        
        String userInput = in.nextLine();
        
        if (userInput.equals("lotto"))
        {
            System.out.print("The lotto winning numbers are ");
            lottoTicket.showNumbers();
            System.out.println();
        }
                               
        else if (userInput.equals("fantasy"))
        {
            System.out.print("The fantasy 5 winning numbers are ");
            fantasyTicket.showNumbers();
            System.out.println();
        }
                               
        else if (userInput.equals("both"))
        {
            System.out.print("The lotto winning numbers are ");
            lottoTicket.showNumbers();
            System.out.println();
                               
            System.out.print("The fantasy 5 winning numbers are ");
            fantasyTicket.showNumbers();
            System.out.println();
        }
        else
            System.out.println("Sorry I couldn't recognize your  command " +
                               "please try again!");
                               
        System.out.println("Thank you for playing!");
    }
    
}
