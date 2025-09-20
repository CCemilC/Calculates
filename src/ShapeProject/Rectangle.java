package ShapeProject;

public class Rectangle implements Transactions{

    private double shortEdge;
    private double longEdge;

    public Rectangle(double shortEdge, double longEdge) {
        this.shortEdge = shortEdge;
        this.longEdge = longEdge;
    }
    @Override
    public double calculateArea() {
        return shortEdge*longEdge;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(shortEdge+longEdge);
    }
}
