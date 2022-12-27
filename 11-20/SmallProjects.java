import java.util.Scanner;
public class SmallProjects {
    public static void main(String[] args){
        System.out.println("Program to print even numbers from 1 to 100");
        for(int i=0;i<=100;i+=2){
            System.out.println(i);
        }
        System.out.println("Program to take user inputs, add them until user enters a negative number");
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int sum = 0;
        while(input >= 0){
            System.out.println("Enter number");
            input = scanner.nextInt();
            sum += input;
            if(input < 0){
                break;
            }
            System.out.println(sum);
        }
        System.out.println("Program to print n th power of 2");
        System.out.println("Enter number :");
        int number;
        number = scanner.nextInt();
        
        for(int i=0;i<=number;i++){
            System.out.println(Math.pow(2, i));
        }



        scanner.close();
    }
}
