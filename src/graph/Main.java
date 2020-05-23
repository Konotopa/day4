package graph;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    Point point1 = new Point(10,4);
        Point point2 = new Point(7,3);
        Point point3 = new Point(1,6);
        Point point4 = new Point(14,4);

        System.out.println("Point 1: "+point1.toString());
        System.out.println("Point 2: "+point2.toString());
        System.out.println("Point 3: "+point3.toString());
        System.out.println("Point 4: "+point4.toString());

        point2.setX(100);

        System.out.println("Point 2: "+point2.toString());

        point4.setXY(-2,-69);
        System.out.println("Point 4: "+point4.toString());

        System.out.println(point1.getXY());
        System.out.println(Arrays.toString(point1.getXY()));

        Point point5 = new Point(5, 4);
        double distanceABPoint = point5.distance(10,4);
        System.out.println("Distance from A to B point is "+distanceABPoint);

        Point point6 = new Point(10,4);
        System.out.println(point5.distance(point6));

        System.out.println(point5.distance());

}


}
