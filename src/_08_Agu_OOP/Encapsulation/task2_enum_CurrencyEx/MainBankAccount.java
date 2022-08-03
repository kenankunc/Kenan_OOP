package _08_Agu_OOP.Encapsulation.task2_enum_CurrencyEx;

import _08_Agu_OOP.Encapsulation.Task1_Account.BankAccount;

public class MainBankAccount {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Kenan123", Currency.EUR);
        System.out.println("UserID: "+bankAccount.getUserId()+" and Currency:"+bankAccount.getCurrency());
        bankAccount.deposit(1000);
        System.out.println(bankAccount.getBalence());
        bankAccount.withdraw(999);
        System.out.println(bankAccount.getBalence());
        bankAccount.withdraw(1);
        System.out.println(bankAccount.getBalence());
        bankAccount.withdraw(1);
        System.out.println(bankAccount.getBalence());

    }



}
