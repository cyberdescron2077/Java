
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int age = 0;
        double height = 0;
        String food = "";


        System.out.println("Enter your name");
        name = scanner.nextLine();
        System.out.println("Enter your age");
        age = scanner.nextInt();
        System.out.println("Enter your height");
        height = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter your favourite food");
        food = scanner.nextLine();
 
        
        scanner.close();

        System.out.println("You are " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("You are " + height + " cm tall");
        System.out.println("You like " + food);
    }
}
