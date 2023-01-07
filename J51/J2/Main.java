package J2;

public class Main {
    public static void main(String[] args) {
        NonStatic nonStatic = new NonStatic();
        NonStatic.Inner inner = nonStatic.new Inner();
        inner.run();        
    }
}
