package _08_Agu_OOP.Encapsulation;

public class Employee {

    private String name;
    private int SSN;
    private int baseSalary;
    private int hourlyRate;

    public Employee(String name, int SSN){
        this.name=name;
        this.SSN=SSN;

    }
    public int calculateWage(int extraHours){
        return baseSalary + (extraHours*hourlyRate);

    }

    public String getName(){

        return name;
    }
    public int getBaseSalary(){

        return baseSalary;
    }

    public void setBaseSalary(int baseSalary){
        if (baseSalary <= 0){
            throw new IllegalArgumentException("Base salary cannot be less than 0!");
        }
        this.baseSalary = baseSalary;
    }

    public void setHourlyRate(int hourlyRate){
        this.hourlyRate= hourlyRate;

    }
    public int getHourlyRate (){
        return hourlyRate;
    }

}
