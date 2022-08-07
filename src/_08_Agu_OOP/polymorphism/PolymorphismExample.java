package _08_Agu_OOP.polymorphism;

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal animal1= new Cat();
        Animal animal2= new Dog();
        Animal animal3= new Horse();


        // if we make Overriding we will have done run time
        animal1.makeSound();
        animal2.makeSound();
        animal3.makeSound();

        System.out.println("-----*-*-*-*-*----------");
        // if we make  we will have done compiler time
        animal1.run(5);
        animal1.run(10,"miles");


    }
}
