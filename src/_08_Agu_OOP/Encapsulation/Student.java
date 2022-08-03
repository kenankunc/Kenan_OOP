package _08_Agu_OOP.Encapsulation;

public class Student {

    private String name;
    private int age;
    private String country;
    private int grade;

    public Student(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getCountry(){
        return country;

    }
    public void setCountry(String country){
        this.country=country;
    }

    public void setGrade(int grade){
        this.grade= grade;
    }
    public int getGrade(){
        return grade;
    }





}
