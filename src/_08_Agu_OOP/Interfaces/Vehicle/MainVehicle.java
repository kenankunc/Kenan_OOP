package _08_Agu_OOP.Interfaces.Vehicle;

import java.util.ArrayList;

public class MainVehicle {
    public static void main(String[] args) {

        TeslaCar teslaCar = new TeslaCar("Model S",310);
        ToyotaPirus toyotaPirus = new ToyotaPirus("Pirus",2000);
        Bus bus = new Bus("Mercedes",5000);

        ArrayList<Vehicle> Cars = new ArrayList<>();
        Cars.add(teslaCar);
        Cars.add(toyotaPirus);
        Cars.add(bus);

        for(Vehicle vehicle : Cars){

            System.out.println("Model = "+ vehicle.getModel());
            System.out.println("Engine= "+ vehicle.getEngine());

            if(vehicle instanceof TeslaCar){
                System.out.println( ((TeslaCar)vehicle).drive());
                System.out.println(((TeslaCar)vehicle).changeBattery());
            }
            if(vehicle instanceof ToyotaPirus) {
                System.out.println(((ToyotaPirus) vehicle).drive());
                System.out.println(((ToyotaPirus) vehicle).changeBattery());
                System.out.println(((ToyotaPirus) vehicle).changeOil());
            }
            if(vehicle instanceof Bus){
                System.out.println( ((Bus)vehicle).drive());
                System.out.println(((Bus)vehicle).changeDiesel());
            }


        }


    }
}
