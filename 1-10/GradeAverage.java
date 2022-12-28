
import java.util.Scanner;
public class GradeAverage {
    public static void main(String[] args){
        int exam1,exam2,exam3,finalExam;
        double average;
        String result;
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Enter results of 1st exam :");
        exam1 = scanner.nextInt();
        System.out.println("Enter the result of 2nd exam : ");
        exam2 = scanner.nextInt();
        System.out.println("Enter the result of 3rd exam :");
        exam3 = scanner.nextInt();
        System.out.println("Enter the result of final exam :");
        finalExam = scanner.nextInt();
        
        average = exam1 * 0.2 + exam2 * 0.2 + exam3 * 0.2 + finalExam * 0.4;
        
        result = (average >= 60) ? "Success" : "Fail";
        
        System.out.println(result);
        scanner.close();
    }
}
