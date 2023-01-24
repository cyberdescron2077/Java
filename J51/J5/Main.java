package J5;
import java.util.*;  

import java.util.LinkedHashSet;

import javax.swing.event.SwingPropertyChangeSupport;

public class Main {
    public static void main(String[] args) {
        
     LinkedHashSet days = new LinkedHashSet<>();

     days.add("Monday");
     days.add("Tuesday");
     days.add("Wednesday");
     days.add("Thursday");
     days.add("Friday");
     days.add("Saturday");
     days.add("Sunday");

     days.add("Monday");

     days.forEach(item -> System.out.print(item + ", "));



    
        


    }    
}
