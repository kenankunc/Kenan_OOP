package _08_Agu_OOP.Inheritance.BicycleExample;

public class DemoBicycle {
    public static void main(String[] args) {
        RaceBike raceBike = new RaceBike(5,20);
        System.out.println("Race Bike Gear =" + raceBike.gear);
        System.out.println("Race Bike Wheel Size =" + raceBike.wheelSize);

        raceBike.speedUp(50);
        System.out.println("RaceBike speed after speed up method..="+ raceBike.speed);
        raceBike.applyBreak(49);
        System.out.println("RaceBike speed after speed down method..="+ raceBike.speed);
        raceBike.applyBreak(2);
        System.out.println("RaceBike speed after speed down method..="+ raceBike.speed);


        KidsBike kidsBike =new KidsBike(5,3);
        System.out.println("Kids Bike Gear =" + kidsBike.gear);
        System.out.println("Kids Bike Wheel Size =" + kidsBike.numberOfWheels);
        kidsBike.speedUp(100);
        System.out.println("Kids speed after speed down method..=" + kidsBike.speed);
        kidsBike.applyBreak(68);
        System.out.println("Kids speed after speed down method..="+kidsBike.speed);

        ElectricBike electricBike=new ElectricBike(8,"lithium ion",30000);
        System.out.println("Elekctric Bike's Gear ="+ electricBike.gear);
        System.out.println("Battery Type " + electricBike.batteryType);
        System.out.println("Battery Capacity"+ electricBike.batteryCapacity);

        electricBike.chargeBattery(5);
        System.out.println("Charge battery ="+ electricBike.batteryLevel);
        electricBike.speedUp(100);
        electricBike.checkUsage();
        System.out.println(electricBike.batteryUsage);



    }



}
