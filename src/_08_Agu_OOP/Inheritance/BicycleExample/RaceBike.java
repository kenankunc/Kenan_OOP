package _08_Agu_OOP.Inheritance.BicycleExample;

public class RaceBike extends Bicycle{
    int wheelSize;

    public RaceBike(int gear, int wheelSize){

        super(gear);
        this.wheelSize= wheelSize;

    }

}
