import java.util.Scanner;

class Person {
    String name;
    String gender;
    String address;
    int age;

    // Constructor to initialize Person data members
    public Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

class Employee extends Person {
    int empId;
    String companyName;
    String qualification;
    double salary;

    // Constructor to initialize Employee data members
    public Employee(String name, String gender, String address, int age, int empId, String companyName,
            String qualification, double salary) {
        super(name, gender, address, age);
        this.empId = empId;
        this.companyName = companyName;
        this.qualification = qualification;
        this.salary = salary;
    }
}

class TeacherDetails extends Employee {
    String subject;
    String department;
    int teacherId;

    // Constructor to initialize TeacherDetails data members
    public TeacherDetails(String name, String gender, String address, int age, int empId, String companyName,
            String qualification, double salary, String subject, String department, int teacherId) {
        super(name, gender, address, age, empId, companyName, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teacherId = teacherId;
    }

    // Method to display all data members
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + empId);
        System.out.println("Company Name: " + companyName);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
        System.out.println("Teacher ID: " + teacherId);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of teachers: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        TeacherDetails[] teachers = new TeacherDetails[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for teacher " + (i + 1) + ":");

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Gender: ");
            String gender = scanner.nextLine();

            System.out.print("Enter Address: ");
            String address = scanner.nextLine();

            System.out.print("Enter Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter Employee ID: ");
            int empId = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter Company Name: ");
            String companyName = scanner.nextLine();

            System.out.print("Enter Qualification: ");
            String qualification = scanner.nextLine();

            System.out.print("Enter Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter Subject: ");
            String subject = scanner.nextLine();

            System.out.print("Enter Department: ");
            String department = scanner.nextLine();

            System.out.print("Enter TeacherDetails ID: ");
            int teacherId = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            teachers[i] = new TeacherDetails(name, gender, address, age, empId, companyName, qualification, salary,
                    subject,
                    department, teacherId);
        }

        System.out.println("\nDetails of Teachers:");
        for (TeacherDetails teacher : teachers) {
            teacher.display();
            System.out.println();
        }

        scanner.close();
    }
}
