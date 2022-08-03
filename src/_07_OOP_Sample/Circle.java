package _07_OOP_Sample;

public class Circle {

    double radius;
    double PI = 3.14;

    double circleOfPerimeter(){

        return (PI*2*radius);

    }
    double circleOfArea(){

        return (2* Math.PI * radius);
    }

}
