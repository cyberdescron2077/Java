import java.util.Scanner;
public class Circle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14;
        double radius;

        System.out.println("Enter radius of circle :");
        radius = scanner.nextDouble();

        System.out.println("Circumference of circle : " + 2*PI*radius);
        System.out.println("Area of circle : " + PI*radius*radius);
    }
}
