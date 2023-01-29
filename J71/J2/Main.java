package J71.J2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.SwingPropertyChangeSupport;

public class Main {
    
    private static double answer,number;
    static int operation;
    static JFrame frame = new JFrame("Calculator");
    static JButton btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnmod,btnCE,btnC,btnDEL,btnX,btnPow,btnSqrt,btnDiv,btnMul,btnSub,btnAdd,btnPM,btnComma,btnEq;
    static JTextField text = new JTextField("");
    static JTextField label = new JTextField("");
    public static void calculate(){
        
        switch(operation){
            case 1: answer = number + Double.parseDouble(text.getText());
            text.setText(Double.toString(answer));
            break;
            case 2: answer = number - Double.parseDouble(text.getText());
            text.setText(Double.toString(answer));
            break;
            case 3: answer = number * Double.parseDouble(text.getText());
            text.setText(Double.toString(answer));
            break;
            case 4: answer = number / Double.parseDouble(text.getText());
            text.setText(Double.toString(answer));
            break;
            case 5: answer = number % Double.parseDouble(text.getText());
            text.setText(Double.toString(answer));
            break;
            case 6: answer = 1/number; 
            text.setText(Double.toString(answer));
            break;
            case 7: answer = Math.pow(number, 2) ;
            text.setText(Double.toString(answer));
            break;
            case 8: answer = Math.sqrt(number) ;
            text.setText(Double.toString(answer));
            break;
            case 9: 
            answer = -number;
            text.setText(Double.toString(answer));
            break;
            case 10: 
            text.setText(Double.toString(answer) + ",");
            break;
            case 11: 
            String num = String.valueOf(number);
            text.setText(num.substring(0, num.length()-1) );
            break;
            

            
            }
            
        }
    
    public static void main(String[] args) {
        
        text.setBounds(60, 100, 200, 50);
        text.setEditable(false);
        label.setBounds(160,50,100,40);
        label.setEditable(false);

        btnmod = new JButton("%");
        btnmod.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                number = Double.parseDouble(text.getText());
                operation = 5;
                text.setText("");
                label.setText(number + e.getActionCommand());                
            }
        });
        btnmod.setBounds(10, 180, 70, 45);
        btnCE = new JButton("CE");
        btnCE.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                text.setText("");
                label.setText("");
            }
        });
        
        btnCE.setBounds(85, 180, 70, 45);
        btnC = new JButton("C");
        btnC.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                text.setText("");
                label.setText("");
                
            }
        });
        btnC.setBounds(160, 180, 70, 45);
        btnDEL = new JButton("\u232b");
        btnDEL.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                number = Double.parseDouble(text.getText());
                operation = 11;
                String num = String.valueOf(number);
                text.setText(num.substring(0, num.length()-1) );
                
                          
            }
        });
        btnDEL.setBounds(235, 180, 70, 45);
        btnX = new JButton("1/x");
        btnX.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                number = Double.parseDouble(text.getText());
                operation = 6;
                text.setText("");
                label.setText("1/"+number);
                          
            }
        });

        btnX.setBounds(10, 230, 70, 45);
        btnPow = new JButton("x\u00B2");
        btnPow.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                number = Double.parseDouble(text.getText());
                operation = 7;
                text.setText("");
                label.setText("pow : " + number);                
            }
        });

        btnPow.setBounds(85, 230, 70, 45);
        btnSqrt = new JButton("\u00B2\u221Ax");
        btnSqrt.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                number = Double.parseDouble(text.getText());
                operation = 8;
                text.setText("");
                label.setText("Sqrt : " + number);                
            }
        });
        btnSqrt.setBounds(160, 230, 70, 45);
        btnDiv = new JButton("\u00F7");
        btnDiv.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                number = Double.parseDouble(text.getText());
                operation = 4;
                text.setText("");
                label.setText(number + e.getActionCommand());                
            }
        });
        btnDiv.setBounds(235, 230, 70, 45);

        btn7 = new JButton("7");
        btn7.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                text.setText(text.getText() + e.getActionCommand());
                
            }
        });
        btn7.setBounds(10, 280, 70, 45);
        btn8 = new JButton("8");
        btn8.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                text.setText(text.getText() + e.getActionCommand());
                
            }
        });
        btn8.setBounds(85, 280, 70, 45);
        btn9 = new JButton("9");
        btn9.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                text.setText(text.getText() + e.getActionCommand());
                
            }
        });
        btn9.setBounds(160, 280, 70, 45);
        btnMul = new JButton("x");
        btnMul.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                number = Double.parseDouble(text.getText());
                operation = 3;
                text.setText("");
                label.setText(number + e.getActionCommand());                
            }
        });
        btnMul.setBounds(235, 280, 70, 45);
        btn4 = new JButton("4");
        btn4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                text.setText(text.getText() + e.getActionCommand());
                
            }
        });
        btn4.setBounds(10, 330, 70, 45);
        btn5 = new JButton("5");
        btn5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                text.setText(text.getText() + e.getActionCommand());
                
            }
        });
        btn5.setBounds(85, 330, 70, 45);
        btn6 = new JButton("6");
        btn6.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                text.setText(text.getText() + e.getActionCommand());
                
            }
        });
        btn6.setBounds(160, 330, 70, 45);
        btnSub = new JButton("-");
        btnSub.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                number = Double.parseDouble(text.getText());
                operation = 2;
                text.setText("");
                label.setText(number + e.getActionCommand());                
            }
        });
        btnSub.setBounds(235, 330, 70, 45);
        btn1 = new JButton("1");
        btn1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                text.setText(text.getText() + e.getActionCommand());
                
            }
        });
        btn1.setBounds(10, 380, 70, 45);
        btn2 = new JButton("2");
        btn2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                text.setText(text.getText() + e.getActionCommand());
                
            }
        });
        btn2.setBounds(85, 380, 70, 45);
        btn3 = new JButton("3");
        btn3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                text.setText(text.getText() + e.getActionCommand());
                
            }
        });
        btn3.setBounds(160, 380, 70, 45);
        btnAdd = new JButton("+");
        btnAdd.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                number = Double.parseDouble(text.getText());
                operation = 1;
                text.setText("");
                label.setText(number + e.getActionCommand());                
            }
        });

        btnAdd.setBounds(235, 380, 70, 45);
        btnPM = new JButton("+/-");
        btnPM.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                operation = 9;
                text.setText("-");
                label.setText("-");
                
            }
        });

        btnPM.setBounds(10,430,70,45);

        btn0 = new JButton("0");
        btn0.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                text.setText(text.getText() + e.getActionCommand());
                
            }
        });
        btn0.setBounds(85,430,70,45);

        btnComma = new JButton(",");
        btnComma.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                operation = 10;
                text.setText(",");
                label.setText(number+",");
                 
            }
        });
        btnComma.setBounds(160,430,70,45);
        btnEq = new JButton("=");
        btnEq.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate();
                            
            }
        });
        btnEq.setBounds(235,430,70,45);
        
        frame.add(btnmod);
        frame.add(btnCE);
        frame.add(btnC);
        frame.add(btnDEL);
        frame.add(btnX);
        frame.add(btnPow);
        frame.add(btnSqrt);
        frame.add(btnDiv);
        frame.add(btn7);
        frame.add(btn8);
        frame.add(btn9);
        frame.add(btn4);
        frame.add(btn5);
        frame.add(btn6);
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btnMul);
        frame.add(btnSub);
        frame.add(btnAdd);
        frame.add(btnPM);
        frame.add(btn0);
        frame.add(btnComma);
        frame.add(btnEq);
        frame.add(text);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(330,530);
        frame.setLayout(null);
        frame.setVisible(true);
        
    }
}
