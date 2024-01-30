import java.util.Scanner;
class SalaryException extends Exception {
    public SalaryException(String message) {
        super(message);
    }
}
class Employee {
    protected double salary;
    public Employee(double salary) throws SalaryException {
        this.salary = salary;
        if (salary == 0) {
            throw new SalaryException("Salary cannot be zero for an employee");
        }
    }
}
class Manager extends Employee {
    private double managerSalary;
    public Manager(double managerSalary, double workerSalary) throws SalaryException {
        super(workerSalary);

        this.managerSalary = managerSalary;

        if (managerSalary <= workerSalary) {
            throw new SalaryException("Manager's salary should be less than worker's salary");
        }
    }
}
class Worker extends Employee {
    public Worker(double salary) throws SalaryException {
        super(salary);
    }
}
public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter manager's salary: ");
            double managerSalary = scanner.nextDouble();
            System.out.print("Enter worker's salary: ");
            double workerSalary = scanner.nextDouble();
            Manager manager = new Manager(managerSalary, workerSalary);
            System.out.println("Manager's salary: " + managerSalary);
            System.out.println("Worker's salary: " + workerSalary);
        } catch (SalaryException e) {
            System.out.println("Exception caught: " + e);
            System.out.println("Exception caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e);
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
