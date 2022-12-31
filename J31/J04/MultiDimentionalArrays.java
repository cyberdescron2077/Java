package J31.J04;
import java.util.Scanner;
public class MultiDimentionalArrays {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter dimention size of multi-dimentional array");
        System.out.println("Rows : ");
        int rows = scanner.nextInt();
        System.out.println("Columns : ");
        int columns = scanner.nextInt();

        System.out.println("Enter elements of array");

        int arr[][] = new int[rows][columns];

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println("");
        }
         
          
        scanner.close();
        

    }
}
