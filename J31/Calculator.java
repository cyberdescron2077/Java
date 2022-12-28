package J31;

public class Calculator {
    public int number1;
    public int number2;
    public String color;
    Calculator(int number1,int number2,String color){
        this.number1 = number1;
        this.number2 = number2;
        this.color = color;

    }
    public int add(){
        return number1 + number2;
    }
    public int sub(){
        return number1 - number2;
    }
    public int mul(){
        return number1 * number2;
    }
    public int div(){
        return number1 / number2;
    }

}
