package _07_OOP_Sample;

import java.sql.SQLOutput;

public class Employee {

    String employeeName;
    String title;
    int ssn;

    void printProperties(){
        System.out.println("Employee Name:" + employeeName);
        System.out.println("Employee Title:"+ title);
        System.out.println("Employee SSN:" + ssn);

    }

}
