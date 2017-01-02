import java.awt.*;


public class SimpleRenderer{

  private static Point p1 = new Point(310, 400);
  private static Point p2 = new Point(360, 240);

  private static Point p3 = new Point(400, 450);
  private static Point p4 = new Point(500, 500);

  public static void render(Graphics2D g){
    int indexer = 0;              //For testing purpose.
    double x1 = (int)p1.getX();
    double x2 = (int)p2.getX();
    double y1 = (int)p1.getY();
    double y2 = (int)p2.getY();
    /* DDA - Digital Differential Algorithm
     * implementation using JFrame.
     */
    double dx, dy, steps, x, y, k;
    double xdiff, ydiff;

    dx = x2 - x1;
    dy = y2 - y1;

    if( Math.abs(dx) > Math.abs(dy) ){
      steps = Math.abs(dx);
    }else{
      steps = Math.abs(dy);
    }

    xdiff = (dx/steps);
    ydiff = (dx/steps);

    x = x1;
    y = y1;
    //g.drawLine(x, y, x, y);
    g.fillOval(200, 500, 5, 5);

    for(int i = 1; i <=steps; i++){
      x += xdiff;
      y += ydiff;
      //g.drawLine(x, y, x, y);
      g.fillOval((int) x, (int)y, 5, 5);
    }
    // This is how we draw a point in JAVA; There is no other way.
    // g.drawLine(300, 350, 300, 350);
  }
}
