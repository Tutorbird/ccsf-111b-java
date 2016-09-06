/* Nestor J Alvarez
   CS 111B, Professor Schatz
   22 February 2016
*/

import java.util.Scanner;
import java.util.*;

public class Assignment5Test {

   public static void main(String[] args) {
   
      ArrayList<String> names = new ArrayList<String>(5);
      ArrayList<Integer> scores = new ArrayList<Integer>(5);
      ArrayList<Integer> temp = new ArrayList<Integer>(5);
      
      scores.add(5);
      scores.add(3);
      scores.add(3);
      scores.add(4);
      scores.add(1);
      
      scores.add(5);
      scores.add(4);
      scores.add(3);
      scores.add(3);
      scores.add(1); //Expect: Alison, Louise, Damian, Lily, Coco
      
      names.add("Alison");
      names.add("Damian");
      names.add("Lily");
      names.add("Louise");
      names.add("Coco");
      
      Collections.sort(scores);
      
      initialize(names, scores);
      sort(names, scores);
      display(names, scores);
         
   }
   
   public static void initialize(ArrayList<String> names, ArrayList<Integer> scores) {
   
      int temp = 0;
      Scanner input = new Scanner(System.in);
      
      for(int i = 0; i < 5; i++) {
      
         System.out.println("Enter the name for score #" + (i+1) + ": ");
         names.add(input.next());
         System.out.println("Enter the score for score #" + (i+1) + ": ");
         
         while (!input.hasNextInt()) {
            System.out.println("Please enter an integer value please. Redundancy isn't fun, is it not?");
            input.next();
         }
         
         scores.add(input.nextInt());
      
      }
   
   }
   
   public static void sort(ArrayList<String> names, ArrayList<Integer> scores) {
   
      int temp = 0;
      String str = "\0";
   
      while(!isSorted(scores)) {
      
         for(int i = 0; i < scores.size() - 1; i++) {
            if(scores.get(i) < scores.get(i+1)) {
               temp = scores.set(i, scores.get(i+1));
               scores.set(i+1, temp);
               str = names.set(i, names.get(i+1));
               names.set(i+1, str);
            }
         }
      
      } 
   
   }
   
   public static boolean isSorted(ArrayList<Integer> scores) {
   
      for(int i = 0; i < scores.size() - 1; i++) {
            
            if(scores.get(i) < scores.get(i+1)) {
               return false;
            }
            
      }
      
      return true;
   
   }
   
   public static void display(ArrayList<String> names, ArrayList<Integer> scores) {
   
      System.out.println("\nTop Scorers: ");
      
      for(int i = 0; i < names.size(); i++) {
      
         System.out.println(names.get(i) + ": " + scores.get(i));
      
      }
   
   }

}
