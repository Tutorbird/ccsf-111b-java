/* Nestor J Alvarez
   CS 111B, Professor Schatz
   19 April 2016
*/
import java.util.*;
import java.io.*;

public class RandomNumberGuesser extends NumberGuesser {

   public RandomNumberGuesser() {
      super();
   }
   
   public RandomNumberGuesser(int lowerBound, int upperBound) {
      super(lowerBound, upperBound);
   }

   protected int getMidPoint(int min, int max) throws IllegalArgumentException {
   
         Random random = new Random();
         
         int temp = 0;
         
         try {
            temp = random.nextInt(max - min) + min;
         } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Cannot go out of the provided bounds");
         }
         
         return temp;
   
//       int diff = (int) Math.ceil((max - min) / 2.0);
//       return max - diff;
   
   }

}