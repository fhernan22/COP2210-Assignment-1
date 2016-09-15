
//******************************************************************************
// PantherID:  6045594
// CLASS: COP 2210 – Fall 2016
// ASSIGNMENT #1
// DATE: 09/14/2016
//
// I hereby swear and affirm that this work is solely my own, and not the work 
// or the derivative of the work of someone else.
//******************************************************************************

package programmingassignment1;

import javax.swing.*;
import java.util.Arrays;

public class ProgrammingAssignment1 {
    public static void main(String[] args) {
        LotteryTicket lottoTicket = new LotteryTicket();    // Lotto ticket
        LotteryTicket fantasyTicket = new LotteryTicket();  // Fantasy 5 ticket
        
        // Object that holds the different values for the input box
        Object[] options = {"lotto", "fantasy", "both"};
        
        // Image icon that will appear in the input dialog
        ImageIcon questionMark = new ImageIcon(ProgrammingAssignment1.class.getResource("question_40.png"));
        
        // Image icon that will appear if the user does not choose an option in the dropdwon menu
        ImageIcon warningSign = new ImageIcon(ProgrammingAssignment1.class.getResource("warning_30.png"));
        
        // Image icon that will appear if the user chooses any of the valid options
        ImageIcon successImg = new ImageIcon(ProgrammingAssignment1.class.getResource("thumbsup_2_3.png"));
        
        // JOptionPane drop down menu
        String userInput = (String)JOptionPane.showInputDialog(
                    null,
                    "Which Florida Lottery Ticket would you like to print?\n",
                    "Florida Lottery",
                    JOptionPane.PLAIN_MESSAGE,
                    questionMark,
                    options,
                    "lotto");
        
        if ( (userInput != null) && (userInput.length() > 0) ) {
            if (userInput.equals("lotto"))
            {
                JOptionPane.showMessageDialog(
                    null,
                    "The lotto winning numbers are " +
                    Arrays.toString(lottoTicket.createTicket(6)).replace("[", "").replace("]", ""),
                    "",
                    JOptionPane.PLAIN_MESSAGE,
                    successImg);
            }
            else if (userInput.equals("fantasy"))
            {
                JOptionPane.showMessageDialog(
                    null,
                    "The fantasy five winning numbers are " +
                    Arrays.toString(fantasyTicket.createTicket(5)).replace("[", "").replace("]", ""),
                    "",
                    JOptionPane.PLAIN_MESSAGE,
                    successImg);
            }    
            else if (userInput.equals("both"))
            {
                JOptionPane.showMessageDialog(
                    null,
                    "The lotto winning numbers are " +
                    Arrays.toString(lottoTicket.createTicket(6)).replace("[", "").replace("]", "") +
                    "\nThe fantasy 5 winning numbers are " +
                    Arrays.toString(fantasyTicket.createTicket(5)).replace("[", "").replace("]", ""),
                    "",
                    JOptionPane.PLAIN_MESSAGE,
                    successImg);          
            }
        }
        else
            JOptionPane.showMessageDialog(null,
                    "Please choose one of the options!",
                    "",
                    JOptionPane.WARNING_MESSAGE,
                    warningSign);
    }  
}
