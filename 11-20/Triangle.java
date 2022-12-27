import java.util.Scanner;
public class Triangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int rows = 5;
        //System.out.println("Enter number of rows");
        //rows = scanner.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------");
        
        for(int i=rows-1;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
