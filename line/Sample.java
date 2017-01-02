import javax.swing.*;
import java.awt.*;


public class Sample extends JPanel{

  public void paintComponent(Graphics g){
    Graphics2D gg = (Graphics2D) g;
    SimpleRenderer.render(gg);
  }


  public static void main(String [] args){
    Sample s = new Sample();
    JFrame f = new JFrame();
    f.getContentPane().add(s);
    f.setSize(640, 480);
    f.show();
  }
}
