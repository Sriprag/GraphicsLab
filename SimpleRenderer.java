import java.awt.*;


public class SimpleRenderer{

  private static Point p1 = new Point(500, 500);
  private static Point p2 = new Point(450, 400);

  private static Point p3 = new Point(400, 450);
  private static Point p4 = new Point(500, 500);

  public static void render(Graphics2D g){
    int indexer = 0;              //For testing purpose.

    /* DDA - Digital Differential Algorithm
     * implementation using JFrame.
     */
    float xdiff = p2.getX() - p1.getX();
    float ydiff = p2.getY() - p1.getY();
    float dx, dy;
    float slope;
    int numOfSteps = 0;

    if( p1.getY() == p2.getY() ){
      slope = 0;
    }else if( p1.getX() == p2.getX() ){
      slope = 2;                  // No slope for vertical lines.
    }else{
      slope = ydiff / xdiff;
    }

    if( Math.abs(slope) <= 1 ){
      int j = p1.getY();
      for(int i = p1.getX(); i < p2.getX(); i++){
        g.drawLine(i, j, i, j);
        System.out.println(i + "" + j);
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
        i += (1 / slope);
      }
    }
    // This is how we draw a point in JAVA; There is no other way.
    // g.drawLine(300, 350, 300, 350);
  }
}
