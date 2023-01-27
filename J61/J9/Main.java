package J61.J9;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {

        //btn.setBounds(x,y,width,height)
        JFrame frame = new JFrame("Button example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton btn = new JButton("Button");
        btn.setBounds(0,0,100,30);
        frame.add(btn);
        
        
        frame.setSize(600,600);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
