public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Point{
    double x, y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +x +"; " + y +  '}';
    }
}

class Circle{
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
}