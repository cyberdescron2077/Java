import java.util.Scanner;
public class Prime {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program to check if a number is prime or not");
	    System.out.println("Enter a number to check prime or not");
	    int choice = scanner.nextInt();
	    
	    if(choice<=1) {
	    	System.out.println("Not a prime");
            scanner.close();
	    	return;
	    }
	    if(choice % 2 == 0) {
	    	if(choice == 2) {
	    		System.out.println("Prime");
	    	}
	    	else {
	    		System.out.println("Not a prime");
	    	}
	    }
	    else {
	    	System.out.println("Prime");
	    }
	    scanner.close();
    }
}
