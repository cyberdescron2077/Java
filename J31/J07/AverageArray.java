package J31.J07;
import java.util.Scanner;
public class AverageArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter how many elements you wish in array");
        int size = scanner.nextInt();
        int sum = 0;
        int arr[] = new int[size];
        System.out.println("Enter the elements of array");
        for(int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
            sum += arr[i];

        }

        System.out.println("Average of array : " + sum/size);
        scanner.close();
    }
}
