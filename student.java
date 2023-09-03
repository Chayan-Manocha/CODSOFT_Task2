import java.util.*;
import java.util.Scanner;//import packages for java//import packages for java??

class Student_marks {
    float science, maths, sst, english, hindi;
    float avg;
    char grades;
    float total;//all the marks are taken as float variables and grades are taken as character variables//

    void enter() {                //an enter method is created to enter all the marks of the students in 5 subjects//
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
        hindi = sc.nextFloat();//at the end of this method we will have marks of 5 subject for a student//
    }

    void calc_total() {            //a calc_total method is created to calculate the total sum of the 5 subjects//           
        total = science + maths + sst + english + hindi;
    }

    void calc_avg() {            //a calc_avg method is created to calculate the average of marks by dividing the sum of marks by 5//
        avg = total / 5;
    }

    void calc_grades() {        //a calc_grades method is created to calculate the grades of the student based on the average of the students//
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

    void display() {            //a display method is created to display the sum of marks,avg of marks,grade of marks//
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
        obj.display();//at the end each method is called and the objects are created to display the result based on the input given by the user//

    }
}
