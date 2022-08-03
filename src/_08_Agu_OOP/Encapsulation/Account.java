package _08_Agu_OOP.Encapsulation;

public class Account {

    private String userId;
    private double balanace;

    public Account(String userId){
        this.userId=userId;

    }

    public String getUserId() {
        return userId;
    }

    public double getBalanace() {
        return balanace;
    }

    public void setBalanace(double balanace) {
        if (balanace < 0){
            throw new IllegalArgumentException(" Balanace cannot be less than 0!");

        }else {
            this.balanace = balanace;
        }


    }
}
