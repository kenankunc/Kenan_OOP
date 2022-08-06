package _08_Agu_OOP.Inheritance.BicycleExample;

public class Bicycle {

    int gear;
    int speed=0;
    public Bicycle(int gear){
        this.gear=gear;
    }

    public void speedUp(int incrementSpeed){
        speed += incrementSpeed;
    }

    public void applyBreak(int decrementSpeed){
        if(decrementSpeed > speed){
            speed=0;
            System.out.println("Speed is not negative for vehicle");
        }
        else
            speed -= decrementSpeed;
    }

}
