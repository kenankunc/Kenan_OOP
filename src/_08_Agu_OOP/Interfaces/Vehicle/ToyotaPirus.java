package _08_Agu_OOP.Interfaces.Vehicle;

public class ToyotaPirus extends Vehicle implements IElectric,IGas{


    public ToyotaPirus(String model, double engine) {
        super(model, engine);
    }


    @Override
    public String changeOil() {
        return "lifetime";
    }

    @Override
    public String changeBattery() {
        return "changeBattery";
    }

    @Override
    public String drive() {
        return "it has autopilot features.";
    }
}
