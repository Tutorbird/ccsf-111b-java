/* Nestor J Alvarez
   CS 111B, Professor Schatz
   7 March 2016, revised 3 May 2016
*/

import java.util.Scanner;
import javax.swing.JOptionPane;

public class GuessingProgram {

   public static void main(String[] args) {
      
      do {
      
         playOneGame();
      
      } while (shouldPlayAgain());
      
   
   }
   
   public static void playOneGame() {

         Scanner input = new Scanner(System.in);
         char choice = '\0';
         int lowerBound = 0, upperBound = 1, temp = 0;
         
         System.out.println("What is the range you would like to try?");
         
         System.out.println("Enter the lower bound.");
         while(!input.hasNextInt()) {
            System.out.println("Please enter a number");
            input.next();  
         }
         lowerBound = input.nextInt();
         
         System.out.println("Enter the upper bound.");
         while(!input.hasNextInt()) {
            System.out.println("Please enter a number.");
            input.next();  
         }
         upperBound = input.nextInt();
         
         if(upperBound < lowerBound) {
            System.out.println("Your upper bound is lower than your lower bound. The values have been switched.");
            temp = lowerBound;
            lowerBound = upperBound;
            lowerBound = temp;
         }
         
         NumberGuesser guesser = new NumberGuesser(lowerBound, upperBound);
         System.out.println("Guess a number between " + lowerBound + " and " + upperBound + "."); 
         
         
         /* The reason why it's a for loop is because 2 to the power of 7 (128) is greater than the number of choices
            This means, that any number can be found within 7 guesses because we are essentially dividing the range of
            answers by 2 and can only do it 7 times. 
            
            EDIT: Now it is modified to run the fewest times based on the given range.
         */
         
         do {
            temp += 1;
         } while (Math.pow(2, temp) < (upperBound - lowerBound));
         
         for(int i = 0; i < temp; i++) {

            choice = getUserResponseToGuess(guesser.getCurrentGuess());
            
            if (choice == 'c') {
               System.out.print("Great! ");
            } else if ( (choice != 'c') && (i == temp - 1)) {
               JOptionPane.showMessageDialog(null, "You either have a faulty memory, or you cheated! Goodbye!");
               System.exit(0);
            } else if (choice == 'l') {
               try {
                  guesser.lower();
               } catch (IllegalStateException e) {
                  JOptionPane.showMessageDialog(null, e.getMessage());
                  System.exit(0);
               }
            } else if (choice == 'h') {
               try {
                  guesser.higher();
               } catch (IllegalStateException e) {
                  JOptionPane.showMessageDialog(null, e.getMessage());
                  System.exit(0);
               } 
            } 
            
         }      
   
   }
   
   public static boolean shouldPlayAgain() {
   
      Scanner input = new Scanner(System.in);
   
      System.out.println("Would you like to play again?");
      
      if (input.next().toLowerCase().charAt(0) == 'y') {
         return true;
      }
   
      return false;
   
   }
   
   public static char getUserResponseToGuess(int guess) {
   
      Scanner input = new Scanner(System.in);
      char response = '\0';
   
      System.out.println("Is it " + guess + "? (h/l/c): ");
      
      response = input.next().toLowerCase().charAt(0);
      
      return response;
   
   }

}