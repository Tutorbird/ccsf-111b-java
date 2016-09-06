import java.util.*;

public class ConwayMain {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
   
      int n = 3; 
      
      for (int i = 0; i < 2*n - 1; i++) {
         for (int j = 0; j < 2*i + 1; j++) {
                     System.out.print(" *");
         }
         System.out.print("\n");
      }
		
// 		ConwayWorld world = new ConwayWorld();
//       
//       Kok_Galaxy gax = new Kok_Galaxy(0, 0, world);
		
// 		// Add some live conway cells, in a horizontal line		
// 		for (int i = 0; i < 6; i++) {
// 			ConwayCell c = new ConwayCell(5, 7 + i, world);
// 			c.setIsAlive(true);
// 			world.replaceCell(c);
//          c = new ConwayCell(6, 7 + i, world);
// 			c.setIsAlive(true);
// 			world.replaceCell(c);
//          c = new ConwayCell(5 + i, 4, world);
// 			c.setIsAlive(true);
// 			world.replaceCell(c);
//          c = new ConwayCell(5 + i, 5, world);
// 			c.setIsAlive(true);
// 			world.replaceCell(c);
//          c = new ConwayCell(8 + i, 11, world);
// 			c.setIsAlive(true);
// 			world.replaceCell(c);
//          c = new ConwayCell(8 + i, 12, world);
// 			c.setIsAlive(true);
// 			world.replaceCell(c);
//          c = new ConwayCell(12, 4 + i, world);
// 			c.setIsAlive(true);
// 			world.replaceCell(c);
//          c = new ConwayCell(13, 4 + i, world);
// 			c.setIsAlive(true);
// 			world.replaceCell(c);
// 		}
// 		
		// Add an always-alive cells
// 		AbstractCell a = new AlwaysAliveCell(5, 5, world);
// 		world.replaceCell(a);
// 			
// 		// Add a never-alive cells
// 		AbstractCell n = new NeverAliveCell(17, 17, world);
// 		world.replaceCell(n);
			
		// Go!	
// 		do {
// 			world.display();
// 			world.advanceToNextGeneration();
// 			
// 			System.out.print("Another? (y/n): ");
// 		} while (input.nextLine().charAt(0) == 'y');
	}
}