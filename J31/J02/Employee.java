package J31.J02;

public class Employee {
    private String empName;
    public double empSalary;
    private int empWorkHours;
    private int empHireYear;
    Employee(String empName,double empSalary,int empWorkHours,int empHireYear){
        this.empName = empName;
        this.empSalary = empSalary;
        this.empWorkHours = empWorkHours;
        this.empHireYear = empHireYear;
    }
    public double tax(double empSalary){
        if(this.empSalary>=1000){
            return (this.empSalary * 0.03);
        }
        return 0.0;
    }
    public int bonus(int empWorkHours){
        int bonus = this.empWorkHours - 45;
        if(bonus >= 0){
            return bonus * 30;
        }
        return 0;
    }

    public double raiseSalary(int empHireYear){
        int workYear = 2022 - this.empHireYear;
        if(workYear < 10){
            return this.empSalary * 0.05;
        }else if(workYear >=10 && workYear <=20){
            return this.empSalary * 0.10;
        }
        return this.empSalary * 0.15;
    }

    public void toString(Employee employee){
        System.out.println("Name : " + this.empName);
        System.out.println("Tax : " + this.tax(empSalary));
        System.out.println("Bonus : " + this.bonus(60));
        System.out.println("Salary raise : " + this.raiseSalary(2015));
        double totalSalary = this.empSalary - this.tax(empSalary) + this.raiseSalary(empHireYear) + this.bonus(empWorkHours) ;
        System.out.println("Your total salary is : " + totalSalary);
    }
}
