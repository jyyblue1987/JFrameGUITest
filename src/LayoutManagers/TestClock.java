package LayoutManagers;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class TestClock {

   public static void main(String[] args) {

       // create jframe
       JFrame frame = new JFrame();
       // set flow layout
       frame.setLayout(new FlowLayout());

       // create ampm label
       JLabel amPm = new JLabel();
       // set serif italic 36
       amPm.setFont(new Font("Serif", Font.ITALIC, 36));

       // create jpanel
       JPanel panel = new JPanel();
       // set flow layout
       panel.setLayout(new FlowLayout());

       // create hh jlabel
       JLabel hh = new JLabel("", SwingConstants.CENTER);
       // set serif italic 36
       hh.setFont(new Font("Serif", Font.ITALIC, 36));

       // create mm jlabel
       JLabel mm = new JLabel("", SwingConstants.CENTER);
       // set serif italic 36
       mm.setFont(new Font("Serif", Font.ITALIC, 36));

       // create ss jlabel
       JLabel ss = new JLabel("", SwingConstants.CENTER);
       // set serif italic 36
       ss.setFont(new Font("Serif", Font.ITALIC, 36));

       // set border to hour,minute and second
       hh.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
       mm.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
       ss.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
       // set height and width of jlabel
       hh.setPreferredSize(new Dimension(60, 50));
       mm.setPreferredSize(new Dimension(60, 50));
       ss.setPreferredSize(new Dimension(60, 50));

       // create a function action listener to upadate time
       Timer SimpleTimer = new Timer(1000, new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent e) {
               // set time to Jlabels
               // create calendar instance
               Calendar calendar = Calendar.getInstance();
               // set calendar hour to hh jlabel
               hh.setText(String.valueOf(calendar.get(Calendar.HOUR)));
               // set calendar minute to mm jlabel
               mm.setText(String.valueOf(calendar.get(Calendar.MINUTE)));
               // set calendar second to ss jlabel
               ss.setText(String.valueOf(calendar.get(Calendar.SECOND)));
               // check AM or PM
               if (calendar.get(Calendar.AM_PM) == Calendar.AM)
                   amPm.setText("AM");
               else
                   amPm.setText("PM");

           }
       });
       // start timer
       SimpleTimer.start();

       // add jlabels to panel
       panel.add(hh);
       panel.add(mm);
       panel.add(ss);

       // add panel and ampm label to frame
       frame.add(panel);
       frame.add(amPm);

       // set title and size of frame
       frame.setTitle("Digital Clock");
       frame.setSize(275, 175);
       frame.show();

   }

}