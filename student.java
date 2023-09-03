import java.util.*;
import java.util.Scanner;

class Student_marks {
    float science, maths, sst, english, hindi;
    float avg;
    char grades;
    float total;

    void enter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks obtained in science");
        science = sc.nextFloat();
        System.out.println("enter the marks obtained in maths");
        maths = sc.nextFloat();
        System.out.println("enter the marks obtained in sst");
        sst = sc.nextFloat();
        System.out.println("enter the marks obtained in english");
        english = sc.nextFloat();
        System.out.println("enter the marks obtained in hindi");
        hindi = sc.nextFloat();
    }

    void calc_total() {
        total = science + maths + sst + english + hindi;
    }

    void calc_avg() {
        avg = total / 5;
    }

    void calc_grades() {
        if (avg >= 91) {
            grades = 'A';
        } else if (avg < 91 && avg >= 81) {
            grades = 'B';
        } else if (avg < 81 && avg >= 71) {
            grades = 'C';
        } else if (avg < 71 && avg >= 61) {
            grades = 'D';
        } else if (avg < 61 && avg >= 51) {
            grades = 'E';
        } else {
            grades = 'F';
        }
    }

    void display() {
        System.out.println("total marks obtained by the student is " + total);
        System.out.println("Average marks obtained by the student is " + avg);
        System.out.println("Overall grade obtained by the student is " + grades);
    }
}

class student {
    public static void main(String args[]) {
        Student_marks obj = new Student_marks();
        obj.enter();
        obj.calc_total();
        obj.calc_avg();
        obj.calc_grades();
        obj.display();

    }
}