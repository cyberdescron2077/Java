import java.util.Scanner;
public class TaxCalculator {
    public static void main(String[] args){
        double price,tax,total;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the price of the product :");
        price = scanner.nextDouble();
        System.out.println("Enter tax rate");
        tax = scanner.nextDouble();
        total = price + (price * tax/100);

        System.out.println("Your total would be : " + total);
        scanner.close();
    }
}
