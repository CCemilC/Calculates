package ShapeProject;

public class Triangle implements Transactions{

    private double x,y,z,h; // x => defined as base

    public Triangle(double x, double y, double z, double h) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.h = h;
    }
    @Override
    public double calculateArea() {
        return (x*h)/2;
    }
    @Override
    public double calculatePerimeter() {
        return x+y+z;
    }
}
