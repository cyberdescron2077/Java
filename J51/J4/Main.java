package J4;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet h = new HashSet();
        h.add(123);
        h.add(231);
        h.add("tunc");
        h.add("a");
        h.add(true);
        h.add(null);
        h.remove(231);
        h.forEach(System.out::println);

        System.out.println("*************************");
        Iterator itr = h.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


        
        
    }
}
