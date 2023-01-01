package J31.J09;

public class ShorterSolutionPalindrome {
    public static void main(String[] args) {
        String str = "alla";
        String temp = "";
        for(int i=str.length()-1;i>=0;i--){
            temp += str.charAt(i);
        }
        if(str.equals(temp)){
            System.out.println("Palindrome!");
        }
    }
}
