package graph;

public class Point {
    private int x;
    private int y;

    public Point(){
        this.x = 0;
        this.y = 0;

    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public String toString() {
        return "("+this.x + ", " +this.y+")";
    }

    public int[] getXY(){
       int[] array = new int[2];
        array[0] = x;
        array[1] =y;
        return array;
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double distance(int xB, int yB){
        double c = Math.sqrt(Math.pow((this.x - xB), 2) + Math.pow((this.y - yB), 2));
         return c;

    }
 public double distance(Point another){
    return Math.sqrt(Math.pow((this.x - another.getX()), 2) + Math.pow((this.y - another.getY()), 2));
}

public double distance(){
    return Math.sqrt(Math.pow((0 - this.x), 2) + Math.pow((0 - this.y), 2));

    }
}
