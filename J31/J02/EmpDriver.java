package J31.J02;

public class EmpDriver {
    public static void main(String[] args){

        Employee employee = new Employee("Tunc",1000, 45, 2015);
       
        employee.toString(employee);

        Employee employee2 = new Employee("Kagan", 1500, 46, 2010);

        employee2.toString(employee2);
       
    }
}
