package _08_Agu_OOP.Inheritance.BicycleExample;

public class KidsBike extends Bicycle{
    int numberOfWheels;
    public KidsBike(int gear,int numberOfWheels){
        super(gear);
        this.numberOfWheels=numberOfWheels;
    }
}
