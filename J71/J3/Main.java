package J71.J3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.event.AncestorListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JTextArea area = new JTextArea();
        JLabel l1 = new JLabel();
        JLabel l2 = new JLabel();
        l1.setBounds(250,10,200,100);
        l2.setBounds(250, 150, 200, 100);
        area.setBounds(10, 150, 200, 300);
        area.setBackground(Color.DARK_GRAY);
        area.setForeground(Color.CYAN);
        JButton btn = new JButton("Calculate"); 
        btn.setBounds(10,10,200,100);
        btn.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                String text = area.getText();
                String words[] = text.split(" ");
                l1.setText("Number of characters :" + text.length());
                l2.setText("Number of words : " + words.length);
                
            }
            
        });


        
        frame.add(area);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(l1);
        frame.add(btn);
        frame.add(l2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
