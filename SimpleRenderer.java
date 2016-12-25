import java.awt.*;


public class SimpleRenderer{

  private static Point p1 = new Point(100, 100);
  private static Point p2 = new Point(150, 150);

  public static void render(Graphics2D g){
    int indexer = 0;              //For testing purpose.
    int slope = p1.slope(p2);     //Slope of linex.

    /* DDR - Digital Differential Algorithm
     * implementation using JFrame.
     */
    if(p1.slope(p2) <= 1){
      int j = p1.getY();
      for(int i = p1.getX(); i < p2.getX(); i++){
        g.drawLine(i, j, i, j);
        j += slope;
        indexer++;
      }
      // For testing purpose.
      System.out.println("This loop executed " + indexer + " times");
    }
    else{
      int i = p1.getX();
      for(int j = p1.getY(); j < p2.getY(); j++){
        g.drawLine(i, j, i, j);
        i += slope;
      }
    }

    // This is how we draw a point in JAVA; There is no other way.
    // g.drawLine(300, 350, 300, 350);
  }
}
