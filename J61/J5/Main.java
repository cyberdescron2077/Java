package J61.J5;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        arr.add("A");
        arr.add("B");
        arr.add("C");

        for(String obj : arr){
            System.out.println(obj);
        }

        HashMap<String,Integer> hash = new HashMap<>();
        hash.put("A", 1);
        hash.put("B",2);
        hash.put("C", 3);
        
        
        System.out.println(hash);


        Test<Integer> i = new Test<Integer>(15);
        System.out.println(i.getObj());

        Test<String> s = new Test<String>("Hello");
        System.out.println(s.getObj());
    }
}
