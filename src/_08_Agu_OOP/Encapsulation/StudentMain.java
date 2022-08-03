package _08_Agu_OOP.Encapsulation;

public class StudentMain {
    public static void main(String[] args) {

        Student student = new Student("Tuğçe");
        student.setAge(5);
        System.out.println(student.getAge());
        student.setCountry("Turkey");
        System.out.println(student.getCountry());
        student.setGrade(12);
        System.out.println(student.getGrade());

        System.out.println(student.getGrade());




    }
}
