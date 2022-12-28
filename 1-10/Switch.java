
import java.util.Scanner;
public class Switch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int choice = scanner.nextInt();

        switch(choice){
            case 1: System.out.println("You have choosen 1");
            break;
            case 2: System.out.println("You have choosen 2");
            break;
            case 3: System.out.println("You have choosen 3");
            break;
            default: System.out.println("Enter a number between 1-3");
            break;

        }
        scanner.close();
    }
}
