import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum=1;
        System.out.println("Enter a number to calculate the factorial");
        int choice = scanner.nextInt();
        if(choice<0){
            scanner.close();
            return;
        }else if(choice == 1 || choice == 0){
            System.out.println("Factorial of 0 or 1 equals to 1");
            scanner.close();
            return;
        }else{
            for(int i=1;i<=choice;i++){
                sum *= i;
            }
        }
        System.out.println(sum);
        scanner.close();
    }
}
