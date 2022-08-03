package _07_OOP_Sample;

public class ContructionEx {
    public static void main(String[] args) {
        Profile profile1 = new Profile("Tuğçe", "Köse");
        Profile profile2 = new Profile("Tuğçe", "Köse",1995);
        Profile profile3 = new Profile("Tuğçe","Köse","Ankara",1995,467890,"tugj","aaaa");


        profile1.printAllInfo();
        System.out.println("*********************");
        profile2.printAllInfo();
        System.out.println("*********************");
        profile3.printAllInfo();

    }
}
