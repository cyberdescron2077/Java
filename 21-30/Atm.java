import java.util.Scanner;
public class Atm{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double balance = 1000;
        int input;
        double money;
       
        while(true){
            System.out.println("State your business");
            System.out.println("Enter 1 for deposit money");
            System.out.println("Enter 2 for withdraw money");
            System.out.println("Enter 3 for balance inquiry");
            System.out.println("Enter 4 to exit");
            input = scanner.nextInt();
            if(input == 1){
                System.out.println("Enter how much you like to deposit");
                money = scanner.nextDouble();
                balance += money;
            }else if(input == 2){
                System.out.println("Enter how much you like to withdraw");
                money = scanner.nextDouble();
                balance -= money;
            }else if(input == 3){
                System.out.println("Your balance is : " + balance);
            }else if(input == 4){
                break;
            }else{
                System.out.println("Please enter valid numbers 1-4");
            }

        }
        System.out.println("Have a nice day!");
        scanner.close();
       
    }
}