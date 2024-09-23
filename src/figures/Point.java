package figures;

public class Point{
    double x, y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +x +"; " + y +  '}';
    }

    public double distanceTo(Point other){
        return Math.sqrt((this.x-other.x)*(this.x-other.x) + (this.y-other.y)*(this.y-other.y));
    }
}
