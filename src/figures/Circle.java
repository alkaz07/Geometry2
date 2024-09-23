package figures;

public class Circle{
    Point center;
    double r;

    public Circle(Point center, double r) {
        this.center = center;
        this.r = r;
    }

    public Circle(double x, double y, double r){
        this.center= new Point(x,y);
        this.r = r;
    }

    @Override
    public String toString() {
        return "figures.Circle{" +
                "c=" + center +
                ", r=" + r +
                '}';
    }
}
