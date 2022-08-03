package _07_OOP_Sample;

public class Profile {
    String firstName;
    String lastName;
    String address;
    int birthDate;
    int phone;
    String email;
    String nickname;



    public Profile(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName=lastName;
    }

    public Profile(String firstName, String lastName,int birthDate ){
        this(firstName,lastName); // calling 1. constructor
        this.birthDate=birthDate;
    }

    public Profile(String firstName, String lastName, String address, int birthDate, int phone, String email, String nickname){
        this(firstName,lastName,birthDate); // calling 2. constructor
        this.address=address;
        this.phone=phone;
        this.email=email;
        this.nickname = nickname;
    }

    void printAllInfo(){
        System.out.print("First Name " + firstName);
        System.out.println();
        System.out.print("Last Name " + lastName);
        System.out.println();
        System.out.print("Address "+ address);
        System.out.println();
        System.out.print("Birth Date " + birthDate);
        System.out.println();
        System.out.print("Phone Number " + phone);
        System.out.println();
        System.out.print("E-mail " + email);
        System.out.println();
        System.out.print("Nickname " + nickname);
    }
}
