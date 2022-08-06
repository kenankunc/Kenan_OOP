package _08_Agu_OOP.Inheritance.BicycleExample;

public class ElectricBike extends Bicycle{
    String batteryType;
    int batteryCapacity;
    boolean batteryUsage;
    int batteryLevel =0;

    public ElectricBike(int gear, String batteryType, int batteryCapacity ){

        super(gear);
        this.batteryCapacity=batteryCapacity;
        this.batteryType=batteryType;


    }

    public void chargeBattery(int charge){
        batteryLevel += charge;

    }
    public void checkUsage(){

        if(speed > 0){
            batteryUsage=true;
        }
    }
}
