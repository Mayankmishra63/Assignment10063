import java.util.*;

class Lab4Prg1 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.set();
        emp.get();
    }
}

class Employee {
    private int empId;
    protected String empName;
    String empDepartment;
    Scanner sc = new Scanner(System.in);

    public void set() {
        System.out.println("Enter Employee ID, Name and Department");
        int id = sc.nextInt();
        String name = sc.next();
        String department = sc.next();
        empId = id;
        empName = name;
        empDepartment = department;
    }

    public void get() {
        System.out.println("Employee Id : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Employee Department : " + empDepartment);
    }
}
