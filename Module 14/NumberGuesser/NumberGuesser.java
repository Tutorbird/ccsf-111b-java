/* Nestor J Alvarez
   CS 111B, Professor Schatz
   7 March 2016, revised 3 May 2016
*/

import java.util.*;
import java.io.*;

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
   
   public void higher() throws IllegalStateException {
      if(getMidPoint(guess, max) == guess || (getMidPoint(min, guess) == max && max != def_max)) {
         throw new IllegalStateException("Same guess was made before. Something is strange. Shutting off");
      }
      min = guess;
      guess = getMidPoint(min, max);
   }
   
   public void lower() throws IllegalStateException {
      if(getMidPoint(min, guess) == guess || (getMidPoint(min, guess) == min && min != def_min)) {
         throw new IllegalStateException("Same guess was made before. Something is strange. Shutting off");
      }
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
   
   protected int getMidPoint(int min, int max) {
   
      int diff = (int) Math.ceil((max - min) / 2.0);
      return max - diff;
   
   }

}