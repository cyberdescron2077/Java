package J6;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet tree = new TreeSet();
        tree.add(10);
        tree.add(1);
        tree.add(2);
        tree.add(2);
        
        try {
            tree.add(null);
        } catch (Exception e) {
            System.out.println(e.toString());
            // TODO: handle exception
        }

        try {
            tree.add("tree");
        } catch (Exception e) {
            System.out.println(e.toString());
            // TODO: handle exception
        }
        tree.forEach(item -> System.out.println(item + ", "));
    }
}
