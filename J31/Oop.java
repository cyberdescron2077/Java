package J31;


public class Oop {
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        calculator.number1 = 10;
        calculator.number2 = 20;
        System.out.println(calculator.number1);
        System.out.println(calculator.number2);
        Calculator calculator2 = new Calculator();
        calculator2.number1 = 20;
        calculator2.number2 = 10;
        System.out.println(calculator2.number1);
        System.out.println(calculator2.number2);
    }
    
}
