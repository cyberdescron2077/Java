import java.util.Scanner;
public class FlightTicket {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int age;
        String flightType;
        double total = 0;
        double ticketPrice = 100;


        //If customer's age is less than 12 he/she gets %50 discount
        //If customer's age is between 12 - 24 he/she gets %10 discount
        //If customer's age is bigger than 65 he/she gets %30 discount
        //Round-trip flight ticket gets %20 discount

        System.out.println("Enter your age");
        age = scanner.nextInt();
        System.out.println("Enter y for round-trip\nEnter n for one way ticket");
        flightType = scanner.next();

        if(flightType.equals("Y") || flightType.equals("y")){
            if(age < 12){
                total = ticketPrice * 0.5 - ticketPrice * 0.2;
            }else if(age >= 12 && age < 24){
                total = ticketPrice * 0.9 - ticketPrice * 0.2;
            }else if(age > 65){
                total = ticketPrice * 0.7 - ticketPrice * 0.2;

            }else{
                total = ticketPrice * 0.2;
            }
        }else if(flightType.equals("N") || flightType.equals("n")){
            if(age < 12){
                total = ticketPrice * 0.5; 
            }else if(age >= 12 && age < 24){
                total = ticketPrice * 0.9; 
            }else if(age > 65){
                total = ticketPrice * 0.7; 

            }else{
                total = ticketPrice;
            }
        }else{
            System.out.println("Please enter valid parameters");
        }

        System.out.println("You total fee is: " + total + "$");
        


    }
}
