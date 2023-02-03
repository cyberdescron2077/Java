package J71.J9;

import javax.swing.JFrame;
import javax.swing.JList;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("JList example");
        Integer[] arr = {1,2,3};
        JList list = new JList(arr);
        list.setBounds(10, 10, 100, 100);
        String[] arr1 = {"a","b","c"};
        JList list1 = new JList(arr1);
        list1.setBounds(150,10,100,100);

        frame.add(list1);
        frame.setLayout(null);
        frame.add(list);
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}