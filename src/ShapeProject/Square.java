package ShapeProject;

public class Square implements Transactions{

    private double edge;

    public Square(double edge) {
        this.edge = edge;
    }

    @Override
    public double calculateArea() {
        return edge*edge;
    }

    @Override
    public double calculatePerimeter() {
        return 4*edge;
    }
}
