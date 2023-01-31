package J71.J5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Checkbox");
        JCheckBox box = new JCheckBox("Java");
        JLabel lbl1 = new JLabel();
        JLabel lbl2 = new JLabel();
        JCheckBox box1 = new JCheckBox("Python");
        JButton btn = new JButton("Control");
        box.addItemListener(new ItemListener(){

            @Override
            public void itemStateChanged(ItemEvent e) {
                // TODO Auto-generated method stub
                lbl1.setText("Java choice " + (e.getStateChange() == 1 ? "chosen" : "not chosen"));
            }
            
        });
        box1.addItemListener(new ItemListener(){

            @Override
            public void itemStateChanged(ItemEvent e) {
                // TODO Auto-generated method stub
                lbl2.setText("Python choice " + (e.getStateChange() == 1 ? "chosen" : "not chosen"));
            }
            
        });
        lbl1.setBounds(10, 120, 150, 50);
        lbl2.setBounds(10, 180, 150, 50);
        box.setBounds(10,10,150,50);
        box1.setBounds(10, 60, 150, 50);
        btn.setBounds(180, 40, 100, 50);
        btn.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                if(box.isSelected()){
                    System.out.println(box.getText() + " chosen");
                }
                if(box1.isSelected()){
                    System.out.println(box1.getText() + " chosen");
                }
            }
            
        });

        frame.add(btn);
        frame.add(box1);
        frame.add(box);
        frame.add(lbl1);
        frame.add(lbl2);
        frame.setSize(800,800);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        }
}
