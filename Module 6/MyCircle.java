/* Nestor J Alvarez
   CS 111B, Professor Schatz
   29 February 2016
*/

public class MyCircle {

   private final double PI = 3.14159;
   private double x, y;
   private double radius;
   
   public MyCircle() {
      this.radius = 0.0;
      this.x = 0.0;
      this.y = 0.0;
   }
   
   public MyCircle(double r) {
      radius = r;
   }
   
   public MyCircle(double x, double y, double r) {
      this.x = x;
      this.y = y;
      radius = r;
   }
   
   public void setX(double x) {
      this.x = x;
   }
   
   public void setY(double y) {
      this.y = y;
   }
   
   public void setRadius(double r) {
      radius = r;
   }
   
   public double getX() {
      return x;
   }
   
   public double getY() {
      return y;
   }
   
   public double getRadius() {
      return radius;
   }
   
   public double getArea() {
      return PI * radius * radius;
   }
   
   public boolean doesOverlap(MyCircle other) {
      if (Math.sqrt( Math.pow((this.x - other.getX()), 2) + Math.pow((this.y - other.getY()), 2) ) < (this.radius + other.getRadius())) {
         return true;
      }
      
      return false;
   }
   
   public String toString() {
      return ("Circle [x = " + x + ", y = " + y + ", r = " + radius + "]");
   }

}