package _08_Agu_OOP.Interfaces.Animal;

import java.util.ArrayList;

public class MainAnimal {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Shark shark= new Shark();
        Swallow swallow= new Swallow();

        ArrayList<Animal> Animals = new ArrayList<>();
        Animals.add(cat);
        Animals.add(shark);
        Animals.add(swallow);

        for(Animal animals: Animals){

            System.out.println(animals.food());
        }


    }
}
