package _07_OOP_Sample;

public class Company {

    String companyName;
    int yearCompanyFounded;
    String companyField;
    String ownerOfCompany;

    Employee employee;

    void hireEmployee(String employeeName, String employeeTitle, int ssn){

        employee = new Employee();
        employee.ssn=ssn;
        employee.employeeName=employeeName;
        employee.title=employeeTitle;

    }

    void fireEmployee(){
    employee= null;

    }

    void printProperties(){
        if (employee == null){
            System.out.println("This company has not employee yet");

        }

        System.out.println("Company Name : "+ companyName );
        System.out.println("Year  "+companyName+ " Founded :" +yearCompanyFounded);
        System.out.println("Company Field : "+ companyField);
        System.out.println("Owner of Company : "+ ownerOfCompany);
        /*if(employee != null){
            employee.printProperties();
        }*/

    }





}
