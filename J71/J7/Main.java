package J71.J7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JComboBox");
        JLabel lbl = new JLabel();
        lbl.setText("In the movie Lord Of The Rings who tried to destroy the One Ring with an axe?");
        lbl.setBounds(20, 30, 500, 100);
        String arr[] = new String[5];
        arr[0] = "Gandalf";
        arr[1] = "Frodo Baggins";
        arr[2] = "Samwise Gemgee";
        arr[3] = "Gimli";
        arr[4] = "Aragorn";
        JComboBox cb = new JComboBox(arr);
        cb.setBounds(20, 120, 150, 30);
        JButton btn = new JButton("Send");
        btn.setBounds(400, 300, 70, 50);
        btn.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                if(cb.getSelectedItem() != "Gimli"){
                    System.out.println("Incorrect Answer!");
                    
                }else{
                    System.out.println("Correct Answer!");
                }
            }
            
        });


        frame.add(btn);
        frame.add(lbl);
        frame.add(cb);
        frame.setSize(600,600);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
