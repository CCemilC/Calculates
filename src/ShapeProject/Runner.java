package ShapeProject;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        Transactions transactions=null;

        System.out.println("**********Shapes**********");
        System.out.println("1.Square");
        System.out.println("2.Triangle");
        System.out.println("3.Circle");
        System.out.println("4.Rectangle");

        System.out.print("Please Enter Your Choice:");
        int userChoice=scanner.nextInt();
        scanner.nextLine();

        switch (userChoice){
            case 1:
                System.out.print("Enter the Edge of the Square:");
                double edgeSquare=scanner.nextDouble();
                transactions=new Square(edgeSquare);
                break;

            case 2:
                System.out.print("Enter the Edges of the Triangle:");
                double x=scanner.nextDouble();
                double y=scanner.nextDouble();
                double z=scanner.nextDouble();
                double h=scanner.nextDouble();
                transactions=new Triangle(x,y,z,h);
                break;

            case 3:
                System.out.print("Enter the Radius of the Circle:");
                double r=scanner.nextDouble();
                transactions=new Circle(r);
                break;

            case 4:
                System.out.print("Enter the Edges of the Rectangle:");
                double a=scanner.nextDouble();
                double b=scanner.nextDouble();
                transactions=new Rectangle(a,b);
                break;

            default:
                System.out.println("Invalid Choice");
        }
        double area=transactions.calculateArea();
        double perimeter= transactions.calculatePerimeter();
        System.out.println(area);
        System.out.println(perimeter);

        scanner.close();
    }
}
