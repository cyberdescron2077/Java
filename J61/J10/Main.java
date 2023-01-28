package J61.J10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame("Label");
        JLabel l = new JLabel();
        l.setText("Text Part");
        l.setBounds(100, 100, 200, 50);
        JButton btn = new JButton();
        btn.setText("Change");
        btn.setBounds(0,0,100,30);
        btn.addActionListener(new ActionListener(){
            int c = 1;
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                l.setText("Text has been changed " + c++ + " times!");
            }
            
        });

        f.add(btn);
        f.add(l);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
