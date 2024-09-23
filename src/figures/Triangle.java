package figures;

public class Triangle extends Figure{
    Point vertexA, vertexB, vertexC;
    //double ab, bc, ca;  НЕ НАДО ТАК ДЕЛАТЬ

    public Triangle(Point vertexA, Point vertexB, Point vertexC) {
        this.vertexA = vertexA;
        this.vertexB = vertexB;
        this.vertexC = vertexC;
//        this.ab = vertexA.distanceTo(vertexB);
//        this.bc = vertexB.distanceTo(vertexC);
//        this.ca = vertexC.distanceTo(vertexA);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                 vertexA +
                ", " + vertexB +
                ", " + vertexC +
                '}';
    }

    public double perimeter(){
//        double ab = vertexA.distanceTo(vertexB);
//        double bc = vertexB.distanceTo(vertexC);
//        double ca = vertexC.distanceTo(vertexA);
//        return ab+bc+ca;
        return getAB()+getBC()+getCA();
    }

    @Override
    public double area() {
        return 0;
    }

    public double getAB(){
        return vertexA.distanceTo(vertexB);
    }
    public double getBC(){
        return vertexB.distanceTo(vertexC);
    }
    public double getCA(){
        return vertexA.distanceTo(vertexC);
    }
}
