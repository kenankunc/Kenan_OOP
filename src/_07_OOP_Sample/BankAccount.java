package _07_OOP_Sample;

public class BankAccount {
    String customerName;
    double customerBalance =0;
    static double totalbalance = 0;
    void deposit (double moneyToDeposit){

        customerBalance += moneyToDeposit;
        totalbalance+= moneyToDeposit;

    }

    void withdraw(double moneyToWithdraw){
        customerBalance -= moneyToWithdraw;
        totalbalance -= moneyToWithdraw;
    }
}
