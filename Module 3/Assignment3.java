/* Nestor J Alvarez
   CS 111B, Professor Schatz
   4 February 2016
*/   


import java.util.Scanner;

public class Assignment3 {


   public static void main(String[] args) {

      do {
      
         playOneGame();
      
      } while (shouldPlayAgain());

   }
   
   public static void playOneGame() {
   
         int min = 1;
         int max = 100;
         int guess = 0;
         char choice = '\0';
      
         System.out.println("Guess a number between 1 and 100.") ;
         
         /* The reason why it's a for loop is because 2 to the power of 7 (128) is greater than the number of choices
            This means, that any number can be found within 7 guesses because we are essentially dividing the range of
            answers by 2 and can only do it 7 times. 
         */   
         
         for(int i = 0; i < 7; i++) {
         
            guess = getMidpoint(min, max);
         
            choice = getUserResponseToGuess(guess);
            
            if (choice == 'c') {
               System.out.print("Great! ");
            } else if ( (choice != 'c') && (i == 6) ) {
               System.out.print("You either have a faulty memory, or you cheated... Good bye!\n");
            } else if (choice == 'l') {
               max = guess;
            } else if (choice == 'h') {
               min = guess;
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
   
   public static int getMidpoint(int min, int max) {
      /* Inside the paranthesese, declare equation as double by making 2 into 2.0
         This is done so that Math.ceil works as intended. Only after Math.ceil works
         as intended, do we static cast it into a int value type.
      */   
      int diff = (int) Math.ceil((max - min) / 2.0);
      
      return max - diff;
      
      
   
   }
}