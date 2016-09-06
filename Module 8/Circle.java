/* Nestor J Alvarez
   CS 111B, Professor Schatz
   12 March 2016
*/

public class Circle {

   private final double PI = 3.14159;
   private final double EPSILON = 0.00001;
   private Point origin;
   private double radius;
   
   public Circle() {
      this.radius = 0.0;
      origin = new Point();
   }
   
   public Circle(double r) {
      origin = new Point();
      radius = r;
   }
   
   public Circle(double x, double y, double r) {
      origin = new Point(x, y);
      radius = r;
   }
   
   public Circle(Point o, double r) {
      origin = new Point(o);
      radius = r;
   }
   
   public Circle(Circle c) {
      origin = new Point(c.getX(), c.getY());
      radius = c.getRadius();
   }
   
   public void setX(double x) {
      origin.setX(x);
   }
   
   public void setY(double y) {
      origin.setY(y);
   }
   
   public void setRadius(double r) {
      radius = r;
   }
   
   public void setOrigin(Point p) {
      origin = new Point(p);
   }
   
   public double getX() {
      return origin.getX();
   }
   
   public double getY() {
      return origin.getY();
   }
   
   public double getRadius() {
      return radius;
   }
   
   public Point getOrigin() {
      return origin;
   }
   
   public double getArea() {
      return PI * radius * radius;
   }
   
   public boolean doesOverlap(Circle other) {
      if (Math.sqrt( Math.pow((this.getX() - other.getX()), 2) + Math.pow((this.getY() - other.getY()), 2) ) < (this.radius + other.getRadius())) {
         return true;
      }
      
      return false;
   }
   
   public boolean equals(Circle c) {
      if (this.origin.equals(c.getOrigin()) && (Math.abs(radius - c.getRadius()) < EPSILON) ) {
         return true;
      }
      
      return false;   
   }
   
   public String toString() {
      return ("Circle [x = " + this.getX() + ", y = " + this.getY() + ", r = " + radius + "]");
   }

}