
//******************************************************************************
// PantherID:  [6045594]
// CLASS: COP 2210 – [Fall 2016]
// ASSIGNMENT # [#1]
// DATE: [09/14/2016]
//
// I hereby swear and affirm that this work is solely my own, and not the work 
// or the derivative of the work of someone else.
//******************************************************************************

package programmingassignment1;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class ProgrammingAssignment1 {
    public static void main(String[] args) {
        LotteryTicket lottoTicket = new LotteryTicket();    // Lotto ticket
        LotteryTicket fantasyTicket = new LotteryTicket();  // Fantasy 5 ticket
        
        lottoTicket.createTicket(6);
        fantasyTicket.createTicket(5);
        
        Object[] options = {"lotto", "fantasy", "both"};
        
        String userInput = (String)JOptionPane.showInputDialog(
                    null,
                    "Which Florida Lottery Ticket would you like to print?\n",
                    "Florida Lottery",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options,
                    "lotto");
        
        if ( (userInput != null) && (userInput.length() > 0) ) {
            if (userInput.equals("lotto"))
            {
                JOptionPane.showMessageDialog(
                    null,
                    "The lotto winning numbers are " +
                    Arrays.toString(lottoTicket.createTicket(6)).replace("[", "").replace("]", ""));
            }
            else if (userInput.equals("fantasy"))
            {
                JOptionPane.showMessageDialog(
                    null,
                    "The fantasy five winning numbers are " +
                    Arrays.toString(fantasyTicket.createTicket(5)).replace("[", "").replace("]", ""));
            }    
            else if (userInput.equals("both"))
            {
                JOptionPane.showMessageDialog(
                    null,
                    "The lotto winning numbers are " +
                    Arrays.toString(lottoTicket.createTicket(6)).replace("[", "").replace("]", "") +
                    "\nThe fantasy 5 winning numbers are " +
                    Arrays.toString(fantasyTicket.createTicket(5)).replace("[", "").replace("]", ""));          
            }
        }
        else
            JOptionPane.showMessageDialog(null,
                    "Please choose one of the options!");
    }  
}
