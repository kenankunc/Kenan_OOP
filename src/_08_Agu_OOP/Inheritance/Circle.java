package _08_Agu_OOP.Inheritance;

public class Circle extends Shape{

    final double PI = 3.14;
    double radius;

    public Circle(double radius){
        this.radius=radius;
        super.area = PI* radius*radius;
        super.perimeter=radius*2*PI;

    }
}
