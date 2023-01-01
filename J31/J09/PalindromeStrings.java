package J31.J09;
import java.util.Scanner;
public class PalindromeStrings {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String abc = "Tunc";
    String tempo= "";
    tempo += abc.charAt(abc.length()-4);
    System.out.println(tempo);
    System.out.println("Enter a String to check palindrome condition :");
    String str = scanner.nextLine();
    System.out.println(str.length());
    String temp = "";
    for(int i=-1;Math.abs(i)<= str.length();i--){
        temp += str.charAt(str.length()+i);        
    }
    if(str.equals(temp)){
        System.out.println("Palindrome!");
    }else{
        System.out.println("Not Palindrome");
    }
    
    
    


        
}
}
