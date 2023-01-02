package J41.J5;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.b = b;
        a.run(b);
    }
}
