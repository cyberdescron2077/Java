
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        double num1,num2;
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1");
        num1 = scanner.nextDouble();
        System.out.println("Enter number 2");
        num2 = scanner.nextDouble();

        double sum = num1 + num2;
        double sub = num1 - num2;
        double div = num1 / num2;
        double mul = num1 * num2;

        System.out.println("Enter operation\n1:Add\n2:Subtract\n3:Multiply\n4:Divide");
        choice = scanner.nextInt();
        switch(choice){
            case 1: System.out.println(num1 + " + " + num2 + " = " + sum);
            break;
            case 2: System.out.println(num1 + " - " + num2 + " = " + sub);
            break;
            case 3: System.out.println(num1 + " * " + num2 + " = " + mul);
            break;
            case 4: System.out.println(num1 + " / " + num2 + " = " + div);
            break;
            default: System.out.println("Enter valid numbers (1-4)");
            break;
        }
        scanner.close();
    }
}
