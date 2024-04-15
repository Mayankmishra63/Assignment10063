import java.util.*;

class Lab4Prg4 {
    public static void main(String[] args) {
        Student obj1 = new Student(50, "sanchit", 9, 7, 10, 6, 5);
        obj1.calculateAverage();
        Student obj2 = new Student(55, "arya", 9, 8, 7, 6, 11);
        obj2.calculateAverage();
        Student obj3 = new Student(52, "Satyam", 5, 8, 7, 6, 5);
        obj3.calculateAverage();
    }
}

class Student {
    int roll;
    String name;
    int mark1, mark2, mark3, mark4, mark5;

    Student(int r, String s, int m1, int m2, int m3, int m4, int m5) {
        roll = r;
        name = s;
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
        mark4 = m4;
        mark5 = m5;
    }

    void calculateAverage() {
        System.out.println("Average of " + name + " is: " + (mark1 + mark2 + mark3 + mark4 + mark5) / 5.0);
    }
}
