package J61.J2;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();

        q.add(80);
        q.add(20);
        q.add(50);
        q.add(10);

        while(!q.isEmpty()){
            System.out.println(q.poll());
        }

    }
}
