package _08_Agu_OOP.Encapsulation;

public class Main {
    public static void main(String[] args) {

        Employee employee =new Employee("kenan",11111);

        employee.setBaseSalary(100);
        employee.setHourlyRate(55);
        System.out.println(employee.getName());
        System.out.println("Base Salary :" + employee.getBaseSalary());
        System.out.println("Hourly Rate :" + employee.getHourlyRate());
        int wage = employee.calculateWage(100);
        System.out.println("wage : "+ wage);



    }


}
