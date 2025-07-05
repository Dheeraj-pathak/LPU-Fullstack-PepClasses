import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    String name;
    int age;
    String designation;
    double salary;

    public Employee(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = capitalize(designation.trim().toLowerCase());
        setInitialSalary();
    }

    private String capitalize(String word) {
        if (word.length() == 0) return word;
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    private void setInitialSalary() {
        switch (designation) {
            case "Programmer":
                salary = 25000;
                break;
            case "Manager":
                salary = 20000;
                break;
            case "Trainer":
                salary = 15000;
                break;
            default:
                salary = 10000;
        }
    }

    public void raiseSalary(double percentage) {
        if (percentage <= 0) {
            System.out.println("Invalid percentage for " + name);
            return;
        }
        double raiseAmount = (salary * percentage) / 100;
        salary += raiseAmount;
    }

    public void display() {
        System.out.printf("Name: %s, Age: %d, Designation: %s, Salary: ₹%.2f\n", name, age, designation, salary);
    }
}

public class EmployeeApp {
    public static void main(String[] args) {
        System.out.println("Program Started: Welcome to Employee Management System!");
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        while (true) {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1) Create Employee");
            System.out.println("2) Display All Employees");
            System.out.println("3) Raise Salaries");
            System.out.println("4) Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine(); // consume newline
                    while (true) {
                        System.out.print("Enter name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter age: ");
                        int age = sc.nextInt();
                        sc.nextLine();
                        if (age <= 0) {
                            System.out.println("Age must be a positive number!");
                            continue;
                        }

                        System.out.print("Enter designation (Programmer/Manager/Trainer): ");
                        String desig = sc.nextLine();

                        if (!desig.equalsIgnoreCase("programmer") &&
                            !desig.equalsIgnoreCase("manager") &&
                            !desig.equalsIgnoreCase("trainer")) {
                            System.out.println("Invalid designation! Please enter Programmer, Manager, or Trainer.");
                            continue;
                        }

                        Employee emp = new Employee(name, age, desig);
                        employees.add(emp);

                        System.out.print("Add another employee? (yes/no): ");
                        String more = sc.nextLine();
                        if (!more.equalsIgnoreCase("yes")) break;
                    }
                    break;

                case 2:
                    System.out.println("\n--- All Employee Details ---");
                    if (employees.isEmpty()) {
                        System.out.println("No employees available.");
                    } else {
                        for (Employee e : employees) {
                            e.display();
                        }
                        System.out.println("Total employees: " + employees.size());
                    }
                    break;

                case 3:
                    System.out.println("\n--- Raising Salaries ---");
                    if (employees.isEmpty()) {
                        System.out.println("No employees to update salary.");
                    } else {
                        System.out.print("Enter percentage to increase salary: ");
                        double percent = sc.nextDouble();
                        sc.nextLine();

                        for (Employee e : employees) {
                            e.raiseSalary(percent);
                            System.out.println("Salary increased for " + e.name + " by " + percent + "%");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please enter between 1 to 4.");
            }
        }
    }
}
