public class Operators {
    public static void main(String[] args){
        int num1 = 5;
        int num2 = 5;

        int sum = 0;
        int division = 0;
        int multiplication = 0;
        int extraction = 0;
        int mod = 0;

        sum = num1 + num2;
        division = num1 / num2;
        multiplication = num1 * num2;
        extraction = num1 - num2;
        mod = num1 % num2;

        System.out.println(sum);
        System.out.println(division);
        System.out.println(multiplication);
        System.out.println(extraction);
        System.out.println(mod);

        num1++;
        num2--;
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);

        System.out.println(num1 == num2);
        System.out.println(num1 != num2);
        System.out.println(num1 > num2);
        System.out.println(num1 < num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 <= num2);
        System.out.println(num1 == num2 && num1 >= num2);
        System.out.println(num1 == num2 || num1 >= num2);
        
        int a = 5;
        int b = (a==5) ? 1 : 0;
        System.out.println(b);
        b = (a==1) ? 1 : 0;
        System.out.println(b);
    }
}
