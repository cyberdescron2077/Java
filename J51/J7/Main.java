package J7;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList country = new ArrayList();
        country.add("a");
        country.add("b");
        country.add("c");
        country.add(0, "a");
        country.add(2, "b");
        country.remove(2);
        country.add(1);
        Iterator itr = country.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        country.forEach(i -> System.out.println(i + ", "));
    }
}
