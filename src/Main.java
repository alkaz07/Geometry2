import figures.Circle;
import figures.Point;
import figures.Triangle;

public class Main {
    public static void main(String[] args) {
        example1();
    }

    private static void example1() {
        Point zero = new Point(0, 0);
        Point pointQ = new Point(100, 0);
        System.out.println("zero = " + zero);
        System.out.println("pointQ = " + pointQ);

        Circle circ1 = new Circle(pointQ, 95);
        Circle circ2 = new Circle(new Point(3, 4), 7);
        Circle circ3 = new Circle(8, 12, 4.7);

        System.out.println("circ1 = " + circ1);
        System.out.println("circ2 = " + circ2);
        System.out.println("circ3 = " + circ3);
        
        Triangle pif = new Triangle(zero, new Point(4, 0), new Point(0, 3));
        System.out.println("pif = " + pif);

    }
}

