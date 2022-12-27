import java.util.Scanner;
public class UserEntry {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String userName = "java";
        String password = "oak";

        System.out.println("Enter username :");
        userName = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter password :");
        password = scanner.nextLine();

        if(userName.equals(userName) && password.equals(password)){
            System.out.println("Welcome");
        }else{
            System.out.println("Wrong username or password");
        }
        scanner.close();
    }
    
}
