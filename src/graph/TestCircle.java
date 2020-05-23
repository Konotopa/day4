package graph;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2,3,1);
        System.out.println(circle1.getCentreX());
        Point point = new Point(3,20)
;
        Circle circle2 = new Circle(point, 4);

        System.out.println(circle2.toString());
        System.out.println("Area of circle: "+circle1.getArea());
        System.out.println(circle2.distance(circle1));
    }
}
