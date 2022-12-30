package J31.J03;
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //DataType arrayName[] = new ArrayType[elementNumber];
        //DataType[] arrayName = new ArrayType[elementNumber];
        //DataType[] arrayName = {e1,e2,e3};
        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
       String arr1[] = new String[5];
       arr1[0] = "T";
       System.out.println(arr1[0]);
       System.out.println("**************************************************");
       System.out.println("Enter 5 integer");
       int arr2[] = new int[5];
       for(int i=0;i<arr2.length;i++){
        arr2[i] = scanner.nextInt();
       }
       for (int i : arr2) {
            System.out.println(i);
       }
       scanner.nextLine();
       System.out.println("**************************************************");
       System.out.println("Enter 5 string");
       String arr3[] = new String[5];
       for(int i=0;i<arr3.length;i++){
        arr3[i] = scanner.nextLine();
       }
       for (String string : arr3) {
            System.out.println(string);
       }
       scanner.close();
    }
}
