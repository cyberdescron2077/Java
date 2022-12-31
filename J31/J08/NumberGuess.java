package J31.J08;
import java.util.Scanner;
import java.util.Random;
public class NumberGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the number guessing game!");
        
        int number = random.nextInt(10);
        int guess = 3; 
        int choice;

        while(guess>0){
            System.out.println("Guess a number between 1-10");
            choice = scanner.nextInt();
            if(choice == number){
                System.out.println("Conguratulations YOU WON!!");
                return;
            }
            guess--;
            System.out.println("Try again.");
            System.out.println("Guess Right : " + guess);
            scanner.close();
        }
    }
}
