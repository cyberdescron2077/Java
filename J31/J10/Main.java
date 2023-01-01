package J31.J10;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int row,column;

        //System.out.println("Welcome to the Mine Field game");
        //System.out.println("Enter dimensions of the board");
        //System.out.println("Enter Rows :");
        //row = scanner.nextInt();
        //System.out.println("Enter Columns :");
        //column = scanner.nextInt();
        MineField mineField = new MineField(2,2);
        
        mineField.run();
    }
}
