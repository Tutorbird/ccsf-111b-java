/* Nestor J Alvarez
   CS 111B, Professor Schatz
   7 March 2016
*/

import java.util.*;

public class NumberGuesser {

   private int min, max, guess;
   private int def_min, def_max;

   public NumberGuesser() {
      min = def_min = 1;
      max = def_max = 100;
      guess = 50;
   }
   
   public NumberGuesser(int lowerBound, int upperBound) {
      min = def_min = lowerBound;
      max = def_max = upperBound;
      guess = getMidPoint(min, max);
   }
   
   public void higher() {
      min = guess;
      guess = getMidPoint(min, max);
   }
   
   public void lower() {
      max = guess;
      guess = getMidPoint(min, max);
   }
   
   public int getCurrentGuess() {
      return guess;
   }
   
   public void reset() {
      min = def_min;
      max = def_max;
      guess = getMidPoint(min, max);
   }
   
   private int getMidPoint(int min, int max) {
   
      int diff = (int) Math.ceil((max - min) / 2.0);
      return max - diff;
   
   }

}