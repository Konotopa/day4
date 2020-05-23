package graph;

public class Circle {
    private Point centre;
    private double radius;

    public Circle() {
        this.centre = new Point();
        this.radius = 0;
    }

    public Circle(int xCentre, int yCentre, double radius) {
        this.centre = new Point(xCentre, yCentre);
        this.radius = radius;
    }

    public Circle(Point centre, double radius) {
        this.centre = centre;
        this.radius = radius;
    }

    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getCentreX() {
        return centre.getX();
    }

    public int getCentreY() {
        return centre.getY();
    }

    public void setCentreX(int x) {
        this.centre.setX(x);
    }

    public void setCentreY(int y) {
        this.centre.setY(y);
    }

    public int[] getCentreXY(){
        int[] arrays = new int[2];
        arrays[0] = centre.getX();
        arrays[1] = centre.getY();
        return arrays;
    }
    public void setCentreXY(int x, int y){
        this.centre.setXY(x,y);
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getCircumference(){
        return 2* Math.PI * radius;
    }

    public double distance(Circle circle){
        return Math.sqrt(Math.pow((this.centre.getX() - circle.getCentreY()), 2) + Math.pow((this.centre.getY() - circle.getCentreY()),2));

    }

    @Override
    public String toString() {
        return "Circle{" +
                "centre=" + centre.toString() +
                ", radius=" + radius +
                '}';
    }

}