package J9;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector v = new Vector();
        System.out.println("Capacity of vector : " + v.capacity());
        

        v.add("a");
        v.add("b");
        v.add("c");
        v.add("d");
        v.add("a");
        System.out.println("Size of vector : " + v.size());
        v.forEach(i -> System.out.println(i + ", "));
    }
}
