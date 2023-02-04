package J80.Clock;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame{

    JLabel labelTime,labelDate,labelDay;
    SimpleDateFormat formatTime,formatDay,formatDate;
    String time,day,date;

    MyFrame(){
        
        this.setSize(250,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("Digital Clock");
        

        labelTime = new JLabel();
        labelTime.setBounds(50,50,100,50);
        labelDay = new JLabel();
        labelDay.setBounds(50,100,100,50);
        labelDate = new JLabel();
        labelDate.setBounds(50,150,100,50);

        formatTime = new SimpleDateFormat("hh:mm:ss a");
        formatDay = new SimpleDateFormat("EEEE");
        formatDate = new SimpleDateFormat("MMMMM.dd.yyyy");
        
        this.add(labelTime);
        this.add(labelDay);
        this.add(labelDate);
        this.setVisible(true);
        SetTime();
    }
    public void SetTime(){
        while(true){
            time = formatTime.format(Calendar.getInstance().getTime());
            labelTime.setText(time);
            day = formatDay.format(Calendar.getInstance().getTime());
            labelDay.setText(day);
            date = formatDate.format(Calendar.getInstance().getTime());
            labelDate.setText(date);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.toString());
                // TODO: handle exception
            }
        }

    }
}
