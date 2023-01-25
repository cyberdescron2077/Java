package J8;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add(1);
        list.add(0, "a");

        list.forEach(i -> System.out.println(i + ", "));
    }
}
