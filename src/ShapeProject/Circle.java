package ShapeProject;

public class Circle implements Transactions {

    private double pi = 3.14;
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return pi * r * r;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * pi * r;
    }
}
