package BonusCalculation;

public class Employee {
    String firstName;
    String lastName;
    int employeeNumber;
    double salary;
    int age;

    public double monthlySalary(){
       double salaryd =salary * 0.8;
        if (salaryd < 10000){
            salaryd *= 0.9;
        } else if (salaryd < 20000){
            salaryd -= 10000;
            salaryd *= 0.8;
            salaryd += 9000;
        } else if (salaryd < 30000){
            salaryd -= 20000;
            salaryd *= 0.68;
            salaryd += 17000;
        } else if (salaryd <= 50000){
            salaryd -= 30000;
            salaryd *= 0.55;
            salaryd += 23800;
        } else if (salaryd > 50001) {
            salaryd -= 50000;
            salaryd *= 0.40;
            salaryd += 34800;
        }
        double monthlySalary = salaryd/12D;
        return monthlySalary;
    }
    public double yearlySalary(){
        double yearSalary = monthlySalary();
        yearSalary *= 12;

        return yearSalary;
    }

}
