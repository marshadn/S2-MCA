/*  Create classes Student and Sports. Create another class Result inherited from
Student and Sports. Display the academic and sports score of a student.*/

import java.util.Scanner;

// Class Student
class Student {
    String name;
    int rollNumber;
    double academicScore;

    // Constructor to initialize Student
    public Student(String name, int rollNumber, double academicScore) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.academicScore = academicScore;
    }

    // Method to display academic details
    public void displayAcademicDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Academic Score: " + academicScore);
    }
}

// Class Sports
class Sports {
    double sportsScore;

    // Constructor to initialize Sports
    public Sports(double sportsScore) {
        this.sportsScore = sportsScore;
    }

    // Method to display sports details
    public void displaySportsDetails() {
        System.out.println("Sports Score: " + sportsScore);
    }
}

// Class Result inherits from Student and Sports
class Result extends Student {
    Sports sports;

    // Constructor to initialize Result
    public Result(String name, int rollNumber, double academicScore, double sportsScore) {
        super(name, rollNumber, academicScore);
        this.sports = new Sports(sportsScore);
    }

    // Method to display complete details
    public void displayResult() {
        System.out.println("Student Result:");
        displayAcademicDetails();
        sports.displaySportsDetails();
    }
}

public class StudentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();

        System.out.print("Enter academic score: ");
        double academicScore = scanner.nextDouble();

        System.out.print("Enter sports score: ");
        double sportsScore = scanner.nextDouble();

        Result result = new Result(name, rollNumber, academicScore, sportsScore);

        System.out.println("\nDetails of the Student:");
        result.displayResult();

        scanner.close();
    }
}
