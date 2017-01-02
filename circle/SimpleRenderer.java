import java.awt.*;


public class SimpleRenderer{

  static int radius = 50;

  public static void render(Graphics2D g){
    int xc, yc;
    xc = 300;
    yc = 300;
    circle(xc, yc, g);
  }

  public static void circle(int xc, int yc, Graphics2D g){
    int P, x, y;
    P = 1 - radius;
    x = 0;
    y = radius;
    draw(x, y, xc, yc, g);
    while (x <= y){
      x++;
      if(P < 0) {
        P += 2 * x + 1;
      } else {
        P += 2 * (x - y) + 1;
        y--;
      }
      draw(x, y, xc, yc, g);
    }
  }

  public static void draw(int x, int y, int xc, int yc, Graphics2D g){
    g.fillOval(xc + x, yc + y, 5, 5);
    g.fillOval(xc + x, yc - y, 5, 5);
    g.fillOval(xc - x, yc + y, 5, 5);
    g.fillOval(xc - x, yc - y, 5, 5);
    g.fillOval(xc + y, yc + x, 5, 5);
    g.fillOval(xc + y, yc - x, 5, 5);
    g.fillOval(xc - y, yc + x, 5, 5);
    g.fillOval(xc - y, yc - x, 5, 5);
  }
}
