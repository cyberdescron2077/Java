import java.util.Scanner;
public class UserEntry {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String userName;
        String password;

        System.out.println("Enter username :");
        userName = scanner.nextLine();
        System.out.println("Enter password :");
        password = scanner.nextLine();

        if(userName.equals("java") && password.equals("oak")){
            System.out.println("Welcome");
        }else{
            System.out.println("Wrong username or password");
        }
        scanner.close();
    }
    
}
