import java.util.ArrayList;
import java.util.Scanner;

class students {
    private String name;
    private int rollNo;
    private double grade;

    public students(String name, int rollNo, double grade) {
        this.name = name;
        this.rollNo = rollNo;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public double getGrade() {
        return grade;
    }
}

public class StudentManagementSystem {
    private ArrayList<students> studentsList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addStudent() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student roll number: ");
        int rollNo = scanner.nextInt();
        System.out.print("Enter student grade: ");
        double grade = scanner.nextDouble();

        students s = new students(name, rollNo, grade);
        studentsList.add(s);

        System.out.println("Student added successfully.");
    }

    public void displayAllStudents() {
        if (studentsList.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("List of Students-");
            for (students s : studentsList) {
                System.out.println("Name: " + s.getName());
                System.out.println("Roll Number: " + s.getRollNo());
                System.out.println("Grade: " + s.getGrade());
                System.out.println("------------------------");
            }
        }
    }

    public void removeStudent() {
        System.out.print("Enter student roll number to remove: ");
        int rollNo = scanner.nextInt();

        for (students s : studentsList) {
            if (s.getRollNo() == rollNo) {
                studentsList.remove(s);
                System.out.println("Student with roll number " + rollNo + " removed successfully.");
                return;
            }
        }
        System.out.println("Student with roll number " + rollNo + " not found.");
    }

    public void searchStudent() {
        System.out.print("Enter student roll number to search: ");
        int rollNo = scanner.nextInt();

        for (students s : studentsList) {
            if (s.getRollNo() == rollNo) {
                System.out.println("Student found-");
                System.out.println("Name: " + s.getName());
                System.out.println("Roll Number: " + s.getRollNo());
                System.out.println("Grade: " + s.getGrade());
                return;
            }
        }
        System.out.println("Student with roll number " + rollNo + " not found.");
    }

    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display all Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    sms.addStudent();
                    break;
                case 2:
                    sms.removeStudent();
                    break;
                case 3:
                    sms.searchStudent();
                    break;
                case 4:
                    sms.displayAllStudents();
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
