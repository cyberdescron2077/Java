package J71.J6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Radio Button");
        JLabel lbl = new JLabel("Please state your gender");
        lbl.setBounds(50, 50, 150, 50);
        JRadioButton btn = new JRadioButton("Male");
        btn.setActionCommand("M");
        btn.setBounds(50, 100, 100, 40);
        JRadioButton btn1 = new JRadioButton("Female");
        btn1.setActionCommand("F");
        btn1.setBounds(50, 150, 100, 40);
        JRadioButton btn2 = new JRadioButton("Prefer not to say",true);
        btn2.setActionCommand("Pref not");
        btn2.setBounds(50, 200, 200, 40);
        ButtonGroup bg = new ButtonGroup();
        bg.add(btn);
        bg.add(btn1);
        bg.add(btn2);
        JButton btn3 = new JButton("Send");
        btn3.setBounds(50, 250, 100, 40);

        btn3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                System.out.println(bg.getSelection().getActionCommand());
            }
            
        });

        frame.add(btn3);
        frame.add(btn2);
        frame.add(btn1);
        frame.add(lbl);
        frame.add(btn);
        frame.setSize(600,600);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
