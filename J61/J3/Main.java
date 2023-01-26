package J61.J3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.remove("b");
        System.out.println(map.get("a")); 
        System.out.println(map);

        map.clear();
        System.out.println(map);

        HashMap m = new HashMap();
        m.put("Turkey", "Ankara");
        m.put("France", "Paris");
        m.put("England", "London");
        System.out.println(m.get("France"));
        System.out.println(m);    

        Set s = m.entrySet();
        Iterator itr = s.iterator();

        s.forEach(i -> System.out.println(i));



    }
}
