import java.util.Scanner;
public class BreakContinue {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int num;
        while(true){
            System.out.println("Enter a number 1-10:");
            num = scanner.nextInt();
            if(num == 0){
                break;
            }
            System.out.println("Try again");
        }
        scanner.close();

       
            for(int i=0;i<10;i++){
                if(i == 4 || i == 9){
                    System.out.println("Skip = " + i);
                    continue;
                }
                System.out.println(i);
            }
        

     
    }
}
