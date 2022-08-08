package _08_Agu_OOP.Interfaces.Vehicle;

public class TeslaCar extends Vehicle implements IElectric{


    public TeslaCar(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "Battery will be going 50 years";
    }

    @Override
    public String drive() {
        return "it has autopilot features.";
    }
}
