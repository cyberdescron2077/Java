package J2;

import javax.swing.event.SwingPropertyChangeSupport;

public class Main {
    public static void main(String[] args) {
        NonStatic nonStatic = new NonStatic();
        NonStatic.Inner inner = nonStatic.new Inner();
        inner.run();
        nonStatic.run();
        
        Static.Inner static1 = new Static.Inner();
        static1.run();

        Local l = new Local();
        l.run();
        
        Anonymous a = new Anonymous(){
            public void run(){
                System.out.println("Anonymous class");
            }
        };
        a.run();
    }
}
