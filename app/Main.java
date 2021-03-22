import entities.Employee;
import entities.Paycheck;
import entities.Timecard;
import entities.Union;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(null, "John Doe", "12332145552", 1, 2, 22, 2040.60);

        employee1.printEmployeeInfo();
        System.out.println("==========================");
    }
}
