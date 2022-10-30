package L01.exceptions;

import java.util.*;
/**
* this class represent a 2d point in the plane. <br>
* supports several operations on points in the plane.
*/
public final class Point {
// ******** private data members ********
	private double _x, _y;  // we "mark" data members using _. 
// ********* constructors ********
   public Point (double x1, double y1){
      _x = x1;
      _y = y1;
   }
 /** copy constructor **/
   public Point (Point p){
      _x = p.x();
      _y = p.y();
   } 
   // ********** public methodes *********
   public double x() {return _x;}
   public double y() {return _y;}
   /** @return a String contains the Point data*/
   public String toString()  {
      return "[" + _x + "," + _y+"]";
   }
//   this is a safe constructor:
	public Point(String str) throws PointException, NumberFormatException, NullPointerException{
		if(str == null) throw new NullPointerException(" NullPointerException: Point is null!!!"); 
		StringTokenizer st = new StringTokenizer(str," [,]");
		int ct = st.countTokens();
		if(ct != 2) throw new PointException(" PointException: "+str+" Point has "+ct+" coordinates instead of 2  ");
		_x = Double.parseDouble(st.nextToken());
		_y = Double.parseDouble(st.nextToken());
	}
}// class Point