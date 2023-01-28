package J61.J9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {

        //btn.setBounds(x,y,width,height)
        JFrame frame = new JFrame("Button example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton btn = new JButton("Button");
        btn.setBounds(100,100,100,30);
        btn.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                System.out.println("Button has been clicked");
            }
            
        });
        
        
        frame.add(btn);
        frame.setSize(600,600);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
