package J71.J8;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTable");
        String[][] data = {
            {"1","2","3"},
            {"3","4","5"},
            {"5","6","7"}};
        String[] head = {"a","b","c"};
        JTable table = new JTable(data,head);
        
        table.setBounds(50, 50, 200, 300);
        JScrollPane sp = new JScrollPane(table);
          

        frame.add(sp);
     
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}
