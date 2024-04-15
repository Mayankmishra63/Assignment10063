import java.util.*;

public class Lab4Prg3 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.display();
        Student student2 = new Student(10050,"Sanchit", 10, 10, 10, 10, 10);
        student2.display();
    }
}

class Student {
    int rollNumber;
    String name;
    int marks1, marks2, marks3, marks4, marks5;
    
    Student() {
        rollNumber = 0;
        marks1 = marks2 = marks3 = marks4 = marks5 = 0;
        name = "Unknown";
    }
    
    Student(int roll, String studentName, int subject1Marks, int subject2Marks, int subject3Marks, int subject4Marks, int subject5Marks) {
        rollNumber = roll;
        name = studentName;
        marks1 = subject1Marks;
        marks2 = subject2Marks;
        marks3 = subject3Marks;
        marks4 = subject4Marks;
        marks5 = subject5Marks;
    }
    
    void display() {
        System.out.println("Roll No. : " + rollNumber);
        System.out.println("Name : " + name);
        System.out.println("Marks in Subject 1 : " + marks1);
        System.out.println("Marks in Subject 2 : " + marks2);
        System.out.println("Marks in Subject 3 : " + marks3);
        System.out.println("Marks in Subject 4 : " + marks4);
        System.out.println("Marks in Subject 5 : " + marks5);
    }
}
