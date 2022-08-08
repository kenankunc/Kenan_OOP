package _08_Agu_OOP.Interfaces.Vehicle;

public class Bus extends Vehicle implements IDiesel{

    public Bus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeDiesel() {
        return "change diesel..";
    }

    @Override
    public String drive() {
        return "it has autopilot features.";
    }
}
