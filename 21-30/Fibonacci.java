

public class Fibonacci {
    public static void main(String[] args) {
        
    
    // 0,1,1,2,3,5,8,13
    int num1 = 0;
    int num2 = 1;
    int sum = 0;
    for(int i=0;i<20;i++){
        System.out.println(num1 + ", ");

        sum = num1 + num2;
        num1 = num2;
        num2 = sum;

    }
    }
}
