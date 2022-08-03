package _07_OOP_Sample;

public class mainCompany {


    public static void main(String[] args) {

    Company tesla = new Company();

    tesla.companyName = "Tesla";
    tesla.yearCompanyFounded=2000;
    tesla.companyField="Electric vehicles";
    tesla.ownerOfCompany="Elon Musk";

    tesla.hireEmployee("kenan","Full Stack Developer",123123123);
        System.out.println("-------------------------------------------------------------");
    tesla.printProperties();

        System.out.println("-------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------");
    tesla.fireEmployee();
    tesla.printProperties();
        int[] a = { 1, 2, 3 };
        int[] b = { 1, 2, 3 };
        System.out.println(a == b);


    }
}
