import java.util.Scanner;

class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

class InvalidEmployeeIdException extends Exception {
    public InvalidEmployeeIdException(String message) {
        super(message);
    }
}

class InvalidDepartmentIdException extends Exception {
    public InvalidDepartmentIdException(String message) {
        super(message);
    }
}

class Employee {
    private int employeeId;
    private String name;
    private int deptId;

    // Constructor to initialize employee details
    public Employee(int employeeId, String name, int deptId) {
        this.employeeId = employeeId;
        this.name = name;
        this.deptId = deptId;
    }

    // Method to display employee details
    public void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + name);
        System.out.println("Department ID: " + deptId);
    }

    // Static method to validate employee details
    public static Employee validateAndCreateEmployee(int employeeId, String name, int deptId)
            throws InvalidEmployeeIdException, InvalidNameException, InvalidDepartmentIdException {
        if (employeeId < 2001 || employeeId > 5001) {
            throw new InvalidEmployeeIdException("Employee ID must be between 2001 and 5001.");
        }
        if (!Character.isUpperCase(name.charAt(0))) {
            throw new InvalidNameException("First letter of employee name must be in capital letter.");
        }
        if (deptId < 1 || deptId > 5) {
            throw new InvalidDepartmentIdException("Department ID must be an integer between 1 and 5.");
        }
        return new Employee(employeeId, name, deptId);
    }
}

// Main class to handle user input and validation
public class q37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Accept employee details from the user
            System.out.print("Enter employee ID: ");
            int employeeId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();
            System.out.print("Enter department ID: ");
            int deptId = scanner.nextInt();

            // Validate and create employee
            Employee employee = Employee.validateAndCreateEmployee(employeeId, name, deptId);

            // Display employee details
            employee.display();

        } catch (InvalidEmployeeIdException | InvalidNameException | InvalidDepartmentIdException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter valid data.");
        } finally {
            scanner.close();
        }
    }
}
