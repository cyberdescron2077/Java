package J41.J10;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program has started...");
        int a = 0;
        try {
            a = 2/0;
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            
        }finally{
            System.out.println("Program has ended.");
        }
        
    }
}
