package _08_Agu_OOP.Encapsulation.Task1_Account;

public class MainAccount {

    public static void main(String[] args) {

        Account account = new Account("Kenan");

        System.out.println(account.getUserId());
        account.setBalanace(100);
        System.out.println("User ID:" + account.getUserId()+"'s "+"Account balance =" + account.getBalanace());
        account.setBalanace(-100);
        System.out.println("User ID:" + account.getUserId()+"'s "+"Account balance =" + account.getBalanace());

    }

}
