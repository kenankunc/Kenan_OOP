package _08_Agu_OOP.Inheritance.ShapeExample;

public class Rectangle extends Shape{

    double length;
    double width;

    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
        super.area= length*width;
        super.perimeter=2*(length+width);
    }

}
