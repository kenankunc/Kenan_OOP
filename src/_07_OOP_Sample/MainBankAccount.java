package _07_OOP_Sample;

public class MainBankAccount {
    public static void main(String[] args) {
        BankAccount bankAccount1= new BankAccount();
        bankAccount1.customerName="kenan";
        System.out.println(bankAccount1.customerName);
        System.out.println(bankAccount1.customerBalance);
        bankAccount1.deposit(1_000_000);
        System.out.println(bankAccount1.customerBalance);
        bankAccount1.withdraw(500_001);
        System.out.println(bankAccount1.customerBalance);

        BankAccount bankAccount2= new BankAccount();
        bankAccount2.customerName="Tuğçe";
        System.out.println(bankAccount2.customerName);
        bankAccount2.deposit(1_000_000);
        System.out.println(bankAccount2.customerBalance);

        System.out.println(BankAccount.totalbalance);



    }
}
