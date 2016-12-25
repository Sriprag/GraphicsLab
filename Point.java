/* A Class for implementing the basic geometrical object Point.
 * Only basic functions have been implemented.
 */

 
class Point{
  int x;
  int y;

  Point(){
    this(0, 0);
  }

  Point(int x, int y){
    this.x = x;
    this.y = y;
  }

  public int getX(){
    return this.x;
  }

  public int getY(){
    return this.y;
  }

  public int slope(Point p){
    return (p.y - this.y) / (p.x - this.x);
  }
}
