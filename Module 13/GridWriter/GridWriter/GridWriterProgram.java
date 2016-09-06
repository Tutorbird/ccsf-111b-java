
public class GridWriterProgram {
	
	public static void main(String[] args) {
		GridWriter gw = new GridWriter(40, 50);
      GridItem gi = new GridItem();
      GridItem s1 = new MySquare(3, 20, 4);
      GridItem s2 = new MySquare(7, 25, 2);
      GridItem s3 = new MySquare(15, 30, 6);
		
		gw.add(new MyCircle(10, 10, 9));
		gw.add(new MyCircle(25, 20, 12));
      System.out.println(gw.size());
		gw.add(new MyCircle(25, 20, 5));
      
      System.out.println(gw.size());
		
		gw.add(new MyRectangle(25, 25, 20, 15));
		gw.add(new MyRectangle(5, 5, 3, 4));
		gw.add(new MyRectangle(40, 0, 10, 10));
      
      gw.add(s1);
      gw.add(s2);
      gw.add(s3);
		System.out.println(gw.size());
		//gw.display();
      
      System.out.println(gi.containsPoint(0,0));
      
      
      try {
         System.out.println(gw.get(-1));
      } catch (IndexOutOfBoundsException e) {
         
      }   
	}
	
}