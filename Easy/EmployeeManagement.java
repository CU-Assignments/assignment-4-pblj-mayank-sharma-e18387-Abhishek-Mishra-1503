import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee {ID: " + id + ", Name: " + name + ", Salary: " + salary + "}";
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Alice", 50000));
        employees.add(new Employee(102, "Bob", 60000));
        employees.add(new Employee(103, "Charlie", 55000));

        System.out.println("Employee List:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}