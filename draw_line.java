import java.awt.*;
import java.applet.*;
import java.util.*;
public class draw_line extends Applet
{
public void paint(Graphics g)
{double dx,dy,steps,x,y,k,x1,x2,y1,y2;
double xc,yc;
Scanner a=new Scanner(System.in);
System.out.println("Enter x1 and y1");
x1=a.nextDouble();
y1=a.nextDouble();
System.out.println("Enter x2 and y2");
x2=a.nextDouble();
y2=a.nextDouble();
dx=x2-x1;
dy=y2-y1;
if(Math.abs(dx)>Math.abs(dy))
steps=Math.abs(dx);
else
steps=Math.abs(dy);
xc=(dx/steps);
yc=(dy/steps);
x=x1;
y=y1;

for(k=1;k<=steps;k++)
{
x=x+xc;
y=y+yc;
g.fillOval((int)x,(int)y,5,5);
}
}
}

/*<applet code="draw_line.class" width="800" height="800">
 </applet>*/
