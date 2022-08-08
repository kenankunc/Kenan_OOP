package _08_Agu_OOP.Interfaces.Vehicle;

public class Vehicle {

    private String model;
    private double engine;

    public Vehicle(String model,double engine){
        setModel(model);
        setEngine(engine);
    }

    public String getModel(){
        return model;
    }

    public double getEngine(){
        return engine;
    }

    public void setModel(String model){
        this.model=model;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }


}
