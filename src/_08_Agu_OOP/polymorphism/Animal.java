package _08_Agu_OOP.polymorphism;

import java.sql.SQLOutput;

public class Animal  {

    public void run(){
        System.out.println("Some Animals can run..");
    }
    public void makeSound(){
        System.out.println("Animals have sounds..");
    }


    public void run(int meters){
        System.out.println("Animal runs "+ meters);
    }
    public void run(int units,String unit){
        System.out.println("animals run " + units +"in" +unit);

    }
}
