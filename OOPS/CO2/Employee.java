// 4. Program to create a class for Employee having attributes eNo, eName eSalary. Read n employ information and Search for an employee given eNo, using the concept of Array of Objects.

import java.util.Scanner;

public class Employee {

    int eNo;
    String eName;
    int eSalary;


    Employee(int eNo, String eName, int eSalary) {
        this.eNo = eNo;
        this.eName = eName;
        this.eSalary = eSalary;
    }

    public void display() {
        System.out.println("Employee Number: " + eNo);
        System.out.println("Employee Name: " + eName);
        System.out.println("Employee Salary: " + eSalary);
    }

    public static Employee[] readEmployeeArray(Scanner sc) {
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        Employee[] arr = new Employee[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details of employee " + (i + 1) + ":");
            System.out.print("Employee Number: ");
            int eNo = sc.nextInt();
            sc.nextLine();
            System.out.print("Employee Name: ");
            String eName = sc.nextLine();
            System.out.print("Employee Salary: ");
            int eSalary = sc.nextInt();
            sc.nextLine();
            arr[i] = new Employee(eNo, eName, eSalary);
        }
        return arr;
    }

    // * Search for an employee in an array
    static int searchEmployee(Employee[] employees, int eNo) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].eNo == eNo) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee[] employees = readEmployeeArray(sc);
        System.out.print("Enter the employee number to search: ");
        int eNo = sc.nextInt();
        int index = searchEmployee(employees, eNo);
        if (index == -1) {
            System.out.println("Not Found!");
        } else {
            System.out.println("Employee with employee number " + eNo + " found");
            employees[index].display();
        }

    }

}