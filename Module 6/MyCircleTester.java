/* Nestor J Alvarez
   CS 111B, Professor Schatz
   29 February 2016
*/

import java.util.*;

public class MyCircleTester {

   public static void main(String[] args) {
   
      /* The fourth circle's radius seems to be the max precision that the 'if' logical operator
         Will work on. If another zero was added, the doesOverlap method would return false
         Even though the circle mathematically still overlaps the other circle, circle5
         For the first two circles, swapping a 2 for a 1 in circle5 in the last digit would return a false
         Likewise, swapping for anything lower than a 9 in the second to last digit in the same circle would be the same.
         In other words, for this simple program, that precision of the doesOverlap method is retricted to 1E-14
       */
      MyCircle circle = new MyCircle(); //Default constructor
      MyCircle circle2 = new MyCircle(2); //Constructor with a radius parameter
      MyCircle circle3 = new MyCircle(5, 5, 5); //Third contructor with <x, y, radius> parameters
      MyCircle circle4 = new MyCircle(-1, -1, 1.000000000000001);
      MyCircle circle5 = new MyCircle(1, -1, 0.9999999999999992);
      
      /* Simple test using an overridden toString method to display the default values of the created circles
         Using the aforementioned constructors. Since, I am lazy, this also kind of also reduces the need to test
         getX(), getY(), and getRadius() individually since I basically use the same "code" in the toString method
       */
      
      System.out.println(circle);
      System.out.println(circle2);
      System.out.println(circle3);
      System.out.println(circle4);
      System.out.println(circle5);
      
      /* As such, I only really have to test out the mutator methods, the getArea(), and doesOverlap(MyCircle circle) methods
         Here, I change some methods and then I rever them back, after a println statement to see what is going on though
         I then go straight into the getArea() testing. I use a PI constant of 3.14159
       */
      
      circle.setX(3);
      circle.setY(3);
      circle.setRadius(3);
      
      System.out.println(circle);
      
      circle = new MyCircle();
      
      System.out.println(circle); //Tests for mutator methods OK. 
      
      System.out.println(circle.getArea()); //Expect 0
      System.out.println(circle2.getArea()); //Expect ~12
      System.out.println(circle3.getArea()); //Expect ~25
      System.out.println(circle4.getArea()); //Expect > PI
      System.out.println(circle5.getArea()); //Expect < PI Tests OK.
      
      System.out.println(circle.doesOverlap(circle2)); //Expect YES. Same position
      System.out.println(circle2.doesOverlap(circle)); //Same as above
      System.out.println(circle3.doesOverlap(circle2)); //Expect false. Radii sum low
      System.out.println(circle.doesOverlap(circle3)); //Expect false. Out of range circle vs. a dot
      
      /* The fourth circle's radius seems to be the max precision that the 'if' logical operator
         Will work on. If another zero was added, the doesOverlap method would return false
         Even though the circle mathematically still overlaps the other circle, circle5
         For the first two circles, swapping a 2 for a 1 in circle5 in the last digit would return a false
         Likewise, swapping for anything lower than a 9 in the second to last digit in the same circle would be the same.
         In other words, for this simple program, that precision of the doesOverlap method is retricted to 1E-14
       */
      System.out.println(circle4.doesOverlap(circle5)); //With trial and error, should return true.
      System.out.println(circle4.doesOverlap(circle4)); //Same circle, should be true
      System.out.println(circle4.doesOverlap(circle)); //Expect false
      
      circle4.setX(0);
      System.out.println(circle4.doesOverlap(circle)); //Expect true; Moved it so it does.
   
   }

}