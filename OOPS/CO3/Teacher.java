/*Create a class ‘Employee’ with data members Empid, Name, Salary, Address and 
constructors to initialize the data members. Create another class ‘Teacher’ that inherit the 
properties of class employee and contain its own data members department, Subjects 
taught and constructors to initialize these data members and also include display function to 
display all the data members. Use array of objects to display details of N teachers */

import java.util.Scanner;

class Employee {
    int empId;
    String name;
    double salary;
    String address;

    // Constructor to initialize Employee data members
    public Employee(int empId, String name, double salary, String address) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}

class Teacher extends Employee {
    String department;
    String[] subjectsTaught;

    // Constructor to initialize Teacher data members
    public Teacher(int empId, String name, double salary, String address, String department, String[] subjectsTaught) {
        super(empId, name, salary, address);
        this.department = department;
        this.subjectsTaught = subjectsTaught;
    }

    // Display function to display all the data members
    public void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        System.out.print("Subjects Taught: ");
        for (String subject : subjectsTaught) {
            System.out.print(subject + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of teachers: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Teacher[] teachers = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for teacher " + (i + 1) + ":");

            System.out.print("Enter Employee ID: ");
            int empId = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter Address: ");
            String address = scanner.nextLine();

            System.out.print("Enter Department: ");
            String department = scanner.nextLine();

            System.out.print("Enter number of subjects taught: ");
            int numSubjects = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            String[] subjectsTaught = new String[numSubjects];
            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Enter subject " + (j + 1) + ": ");
                subjectsTaught[j] = scanner.nextLine();
            }

            teachers[i] = new Teacher(empId, name, salary, address, department, subjectsTaught);
        }

        System.out.println("\nDetails of Teachers:");
        for (Teacher teacher : teachers) {
            teacher.display();
            System.out.println();
        }

        scanner.close();
    }
}
