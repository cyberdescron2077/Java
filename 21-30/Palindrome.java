
public class Palindrome {
    public static void main(String args[]){  
        // 1221 % 10 = 1
        // 1221 / 10 = 122

        //122 % 10 = 2
        // 122 / 10 = 12

        //12 % 10 = 2
        //12 / 10 = 1

        //1 % 10 = 1
      
        int number = 0;
        int remainder;
        int temp = number;
        int reverse = 0;
        
        while(temp!=0){
            remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp /= 10;
        }
        if(reverse == number){
            System.out.println("Palindrome");

        }else{
            System.out.println("Not Palindrome");
        }



      }   
}
