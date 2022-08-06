package _08_Agu_OOP.Inheritance.ShapeExample;

public class MainShape {


    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("circle of radius"+ circle.radius);
        System.out.println("PI"+circle.PI);
        System.out.println("Circle of area "+ circle.area);
        System.out.println("circle of perimeter "+ circle.perimeter);

        Square square = new Square(5);
        System.out.println("Sqare side =" + square.side);
        System.out.println("Sqare length ="+ square.length);
        System.out.println("Sqare width ="+ square.width);
        System.out.println("Sqare area ="+ square.area);
        System.out.println("Sqare perimeter ="+ square.perimeter);

        Rectangle rectangle =new Rectangle(3,4);
        System.out.println("rectangle length ="+ rectangle.length);
        System.out.println("rectangle width ="+ rectangle.width);
        System.out.println("rectangle area ="+ rectangle.area);
        System.out.println("rectangle perimeter ="+ rectangle.perimeter);



    }
}
