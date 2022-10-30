package L01.interfaceComparable;
import java.util.Arrays;
public class TestPoint {
	public static void main(String[] args) {
		//Comparable<Point> [] points = new Comparable[5];
		//Comparable<Point> [] points = new Point[5];
		Point [] points = new Point[5];
		for (int i=0; i<points.length; i++){
			points[i] = new Point(points.length-i, points.length-i);
		}
		System.out.println("Values before sorting:");
		for (int i = 0 ; i < points.length ; i++)
			System.out.print(points[i]+", ");
		System.out.println();
		Arrays.sort(points);
		System.out.println("Values after sorting:");
		for (int i = 0 ; i < points.length ; i++)
			System.out.print(points[i]+", ");
		System.out.println();
	}
}
