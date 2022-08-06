package _08_Agu_OOP.Inheritance;

import _08_Agu_OOP.Inheritance.School.Alex;
import _08_Agu_OOP.Inheritance.School.David;

public class MathLesson {
    public static void main(String[] args) {
        David david =new David(100,90,80);
        Alex alex= new Alex(60,70,80);

        System.out.println(alex.calculateGradeAvg(alex.getGrade1(),alex.getGrade2(),alex.getGrade3()));
        System.out.println(david.calculateGradeAvg(david.getGrade1(),david.getGrade2(),david.getGrade3()));


    }
}
