package figures;

public class Triangle{
    Point vertexA, vertexB, vertexC;

    public Triangle(Point vertexA, Point vertexB, Point vertexC) {
        this.vertexA = vertexA;
        this.vertexB = vertexB;
        this.vertexC = vertexC;
    }

    @Override
    public String toString() {
        return "figures.Triangle{" +
                 vertexA +
                ", " + vertexB +
                ", " + vertexC +
                '}';
    }
}
