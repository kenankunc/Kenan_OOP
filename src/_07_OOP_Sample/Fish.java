package _07_OOP_Sample;

import java.util.Arrays;

public class Fish {

    String color;
    int age;
    String type;
    String[] listOfNeeds;

    Owner owner;




    void printProperties(){

        System.out.println("color:"+ color);
        System.out.println("Age:"+ age);
        System.out.println("type"+ type);
        System.out.println("list Of Need: "+ Arrays.toString(listOfNeeds));


    }
}
