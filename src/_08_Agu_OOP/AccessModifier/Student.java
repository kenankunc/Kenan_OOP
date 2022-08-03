package _08_Agu_OOP.AccessModifier;

public class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;

    }
    void printFunction(){
        System.out.println(" name " + name + "age "+ age);
    }

    private Student(){

    }
}
