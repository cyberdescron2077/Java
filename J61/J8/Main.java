package J61.J8;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        JButton btn = new JButton("Button");
        
        panel.add(btn);

        
        frame.setVisible(true);
    }
}
