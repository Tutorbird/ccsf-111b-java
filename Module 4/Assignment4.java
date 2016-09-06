/* Nestor J Alvarez
   CS 111B, Professor Schatz
   13 February 2016
*/

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class Assignment4 {

   public static void main(String[] args) {

      do {
         playGame();
      } while (shouldPlayAgain());

   }
   
   public static void playGame() {
      
      int hand[] = new int[5];
      
      boolean pair = false, three = false, four = false;
      boolean twopair = false, straight = false, full = false;
      
      System.out.println("Enter five numeric cards, no face cards. Use 2 - 9");
      

      
      generateCards(hand);
      Arrays.sort(hand);
      
      for(int i = 0; i < 5; i++ ) {
         System.out.println(hand[i]);
      }

      if (four = containsFourOfaKind(hand)) {
         System.out.println("Four of a Kind!");
      } else if (full = containsFullHouse(hand)) {
         System.out.println("Full House... or should I say Fuller House! Ha get it? No?");
      } else if (straight = containsStraight(hand)) {
         System.out.println("Straight!");
      } else if (three = containsThreeOfaKind(hand)) {
         System.out.println("Three of a Kind!");
      } else if (twopair = containsTwoPair(hand)) {
         System.out.println("Two Pairs!");
      } else if (pair = containsPair(hand)) {
         System.out.println("One pair! Just one.");
      } else {
         System.out.println("Nothing! High card: " + hand[4]);
      }
   
   }
   
   public static boolean shouldPlayAgain() {
      
      Scanner input = new Scanner(System.in);
      char choice = '\0';
      
      System.out.println("Would you like to play again? (y/n)");
      
      choice = input.next().toLowerCase().charAt(0);
      
      if (choice == 'y') {
         System.out.println("Lovely! Care for a cup o' tea? I'll wait...");
         return true;
      } else {
         System.out.println("Oh what a pitty... goodbye.");
      }
      
      return false;
      
   }
   
   public static void generateCards(int hand[]) {
         
         Scanner input = new Scanner(System.in);
         int temp = 0, offense = 0;
   
         for (int i = 0; i < 5; i++) {
         if (!input.hasNextInt()) {
            if (offense > 5) {
               System.out.println("I give up. Good bye!");
               System.exit(0);
            }
            System.out.println("Please! Don't break me. I am a simple computer program.");
            System.out.println("Enter only an integer between 2 and 9, inclusively.");
            input.nextLine();
            offense++;
            i--;
         } else {
            temp = input.nextInt();
            if (temp < 2 || temp > 9) {
               
               if (offense > 5) {
                  System.out.println("I give up. Good bye!");
                  System.exit(0);
               }
               
               System.out.println("Just a number. 2, 3, 4, 5, 6, 7, 8, or 9.");
               offense++;
               i--;
            
            } else {
               hand[i] = temp;
               System.out.println("Card " + (i+1) + ": " + temp);
            }
         }
      }
   
   }
   
   public static boolean containsPair(int hand[]) {
   
      //Since we don't want to access an index that doesn't exist, we limit the loop to 4
      for(int i = 0; i < 4; i++ ) {
         if (hand[i] == hand[i+1]) {
            return true;
         }
      }
      
      return false;
      
   }
   
   public static boolean containsTwoPair(int hand[]) {
   
      /* Since we have reached this function, it means we didn't find any three of a kind
         or any higher value collection of cards. Since we are reading this, it follows that
         we found at least one pair already. Unfortunately, without passing a second argument
         (I am unsure if we prohibited to do so based on auto graders) we, or I, have to
         recheck in order to know it's place (at the beginning, middle, or end.
         I could put all those tests in one 'if' statement, but I dislike code that doesn't wrap.
      */
      
      if (hand[0] == hand[1] && hand[2] == hand[3]) {
         return true;
      } else if (hand[0] == hand[1] && hand[3] == hand[4]) {
         return true;
      } else if (hand[1] == hand [2] && hand[3] == hand[4]) {
         return true;
      }
      
      return false;
   
   }
   
   public static boolean containsThreeOfaKind(int hand[]) {
   
      for(int i = 0; i < 3; i++ ) {
         if (hand[i] == hand[i+1] && hand[i] == hand[i+2]) {
            return true;
         }
      }
      
      return false;
      
   }
   
   public static boolean containsStraight(int hand[]) {
      /* This is taking advantage of the included Arrays.sort
         I only need to test if the last value is 4 more than the 1st.
      */
      final int CARD_RANGE = 4;
      
      if (hand[4] == (hand[0] + CARD_RANGE)) {
         return true;
      }
      
      return false;
        
   }
   
   public static boolean containsFullHouse(int hand[]) {
   
      /* Since the cards are already sorted, we need to test two cases
         similar to the Four of a Kind tester. We need to test whether
         The pair exists in the beginning or in the end. 
         P = Pair, T = Triple. The code may be messy, but I think optimal.
         [ 0 1 2 3 4 ]
         [ P P T T T ] 1st scenario
         [ T T T P P ] 2nd scenario
      */
      
      if (hand[0] == hand[1] && hand[2] == hand[4]) {
         return true;
      } else if (hand[0] == hand[2] && hand[3] == hand[4]) {
         return true;
      }
      
      return false;
      
   }
   
   public static boolean containsFourOfaKind(int hand[]) {
   
      /* Since the cards are already sorted, we just need to
         check whether the cards at the 0 index match the 3rd index.
         If the sequence starts at index 1, we check index 4.
         Graphically
         [ 0 1 2 3 4 ]
         [ X X X X ? ] 1st iteration check
         [ ? X X X X ] 2nd iteration check
      */   
   
      for (int i = 0; i < 2; i++) {
         if (hand[i] == hand[i+3]) {
            return true;
         }
      }
      
      return false;
   
   }

}