package BonusCalculation;

public class BonusCalculationDemoApp {
    public static void main(String[] args) {


                Employee employee1 = new Employee();

                employee1.lastName = "";
                employee1.firstName = "";
                employee1.employeeNumber = 1;
                employee1.salary = 28000;
                employee1.age = 34;

                System.out.println("employee1.monthlySalary() = " + employee1.monthlySalary());
                System.out.println("employee1.yearlySalary() = " + employee1.yearlySalary());



    }
}
