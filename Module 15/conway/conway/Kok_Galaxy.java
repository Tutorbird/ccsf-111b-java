/* Nestor Alvarez
   10 May 2016
 */   

public class Kok_Galaxy extends AbstractCell {

   public Kok_Galaxy(int r, int c, ConwayWorld world) {
      
      super(r, c, world);
      this.setIsAlive(true);
      
      for (int i = 0; i < 6; i++) {
			ConwayCell cell = new ConwayCell(r + 2, c + 5 + i, world);
			cell.setIsAlive(true);
			world.replaceCell(cell);
         cell = new ConwayCell(r + 3, c + 5 + i, world);
			cell.setIsAlive(true);
			world.replaceCell(cell);
         cell = new ConwayCell(r + 2 + i, c + 2, world);
			cell.setIsAlive(true);
			world.replaceCell(cell);
         cell = new ConwayCell(r + 2 + i, c + 3, world);
			cell.setIsAlive(true);
			world.replaceCell(cell);
         cell = new ConwayCell(r + 5 + i, c + 9, world);
			cell.setIsAlive(true);
			world.replaceCell(cell);
         cell = new ConwayCell(r + 5 + i, c + 10, world);
			cell.setIsAlive(true);
			world.replaceCell(cell);
         cell = new ConwayCell(r + 9, c + 2 + i, world);
			cell.setIsAlive(true);
			world.replaceCell(cell);
         cell = new ConwayCell(r + 10, c + 2 + i, world);
			cell.setIsAlive(true);
			world.replaceCell(cell);
		}
   
   }
   
   public boolean willBeAliveInNextGeneration() {
		return true;
	}
   
   public AbstractCell cellForNextGeneration() {
   
      Kok_Galaxy temp = new Kok_Galaxy(getRow(), getColumn(), world);
      
      temp.world.advanceToNextGeneration();
      
      return temp;
   
   }

}