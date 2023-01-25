package J10;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue q = new LinkedList();
        q.add("Dennis");
        q.add("Jason");
        q.add("Martha");
        q.offer("Alex");
        System.out.println("remove : " + q.remove());
        System.out.println("element : " + q.element());
        System.out.println("poll : " + q.poll());
        System.out.println("peek : " + q.peek());
        q.forEach(i -> System.out.println(i + ", "));

    }
}
