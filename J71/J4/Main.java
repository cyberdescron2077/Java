package J71.J4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JPasswordField");
        JPasswordField pw = new JPasswordField();
        pw.setBounds(10, 50, 100, 30);
        JLabel l1 = new JLabel("Password :");
        l1.setBounds(10, 10, 200, 30);
        JButton btn = new JButton("Apply");
        btn.setBounds(120, 50, 80, 40);
        btn.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                String password = new String(pw.getPassword());
                l1.setText(l1.getText() + password);
            }
            
        });

        frame.add(pw);
        frame.setSize(400,400);
        frame.add(l1);
        frame.add(btn);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
