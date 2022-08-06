package _08_Agu_OOP.Inheritance.School;

public class David extends StudentEntities{
    private int grade1,grade2,grade3,age=28;
    private String name= "David";

    public David( int grade1, int grade2,int grade3){

        this.grade1=grade1;
        this.grade2= grade2;
        this.grade3=grade3;

    }

    public int getGrade1() {
        return grade1;
    }

    public void setGrade1(int grade1) {
        this.grade1 = grade1;
    }

    public int getGrade2() {
        return grade2;
    }

    public void setGrade2(int grade2) {
        this.grade2 = grade2;
    }

    public int getGrade3() {
        return grade3;
    }

    public void setGrade3(int grade3) {
        this.grade3 = grade3;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
