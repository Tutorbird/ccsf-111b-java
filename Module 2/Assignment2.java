/*
 Nestor Alvarez
 CS 11B, Spring 2016
 28 January 2016
 */
 
 import java.util.Scanner;
 import java.util.*;
 
 public class Assignment2 {
 
    public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      Random random = new Random();
      
      int count = 0, temp = 0;
      char repeat = 'y', add_card = '\0';
      
      while (repeat == 'y') {
         
         System.out.print("First cards:");   
         
         for (int i = 0; i < 2; i++) {
            //The following is used to shift the range of the random output by 1,
            //so that the range is actually 1 through 10, not 0 to 9.
            temp = random.nextInt(10) + 1;
            count += temp;
            System.out.print(" " + temp);
         }
         
         System.out.println("\nTotal: " + count);
         
         while (count < 21) {
            System.out.println("Would you like another card? (y/n)");
            add_card = input.next().toLowerCase().charAt(0);
            if (add_card == 'y') {
               System.out.println("You have selected yes.");
               temp = random.nextInt(10) + 1;
               System.out.println("Your new card has a value of: " + temp);
               count += temp;
               System.out.println("Total: " + count);
            } else if (add_card != 'y') {
               System.out.println("You have selected an option other than yes");
               break;
            }
            if (count > 21) {
               System.out.println("BUST! Better luck next time.");
            } else if (count == 21) {
               System.out.println("Winner! Winner! Chicken dinner!");
               break;
            }
         }
         
         System.out.println("Would you like to play again? (y/n)");
         repeat = input.next().toLowerCase().charAt(0);
         
         if (repeat != 'y') {
            System.out.println("Goodbye! Have a nice day!");
         } else {
            count = 0;
         }
      }
      
          
    }
 
 }