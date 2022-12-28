package J31.J01;


public class Oop {
    public static void main(String[] args){
        Calculator calculator = new Calculator(10,5,"Blue");

        System.out.println(calculator.number1);
        System.out.println(calculator.number2);
        System.out.println(calculator.add());
        
        Calculator calculator2 = new Calculator(1,2,"Black");
        
        System.out.println(calculator2.number1);
        System.out.println(calculator2.number2);

        System.out.println(calculator2.div());
    }
    
}
