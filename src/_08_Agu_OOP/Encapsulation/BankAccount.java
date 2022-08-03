package _08_Agu_OOP.Encapsulation;

public class BankAccount {

    private String userId;
    private double balence;
    private Currency currency;

    public BankAccount(String userId, Currency currency){

        this.currency=currency;
        this.userId=userId;


    }

    public String getUserId(){
        return userId;
    }
    public double getBalence(){
        return balence;
    }

    public Currency getCurrency() {
        return currency;
    }


    public void deposit(double moneyToDeposit){
    balence += moneyToDeposit;
    }

    public void withdraw(double moneyToWithdraw){
       if(moneyToWithdraw > balence){
           throw new IllegalArgumentException(" withdraw is not bigger than balance...!!");
       }
        balence -= moneyToWithdraw;


    }

}
