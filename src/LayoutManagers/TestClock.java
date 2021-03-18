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

       // create jfr
       JFrame fr = new JFrame();
       // set flow layout
       fr.setLayout(new FlowLayout());

       // create ampm label
       JLabel lblAmPm = new JLabel();
       // set serif italic 36
       lblAmPm.setFont(new Font("Serif", Font.ITALIC, 36));

       // create jpanel
       JPanel panel = new JPanel();
       // set flow layout
       panel.setLayout(new FlowLayout());

       // create lblHH jlabel
       JLabel lblHH = new JLabel("", SwingConstants.CENTER);
       // set serif italic 36
       lblHH.setFont(new Font("Serif", Font.ITALIC, 36));

       // create lblMM jlabel
       JLabel lblMM = new JLabel("", SwingConstants.CENTER);
       // set serif italic 36
       lblMM.setFont(new Font("Serif", Font.ITALIC, 36));

       // create lblSS jlabel
       JLabel lblSS = new JLabel("", SwingConstants.CENTER);
       // set serif italic 36
       lblSS.setFont(new Font("Serif", Font.ITALIC, 36));

       // set border to hour,minute and second
       lblHH.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
       lblMM.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
       lblSS.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
       // set height and width of jlabel
       lblHH.setPreferredSize(new Dimension(60, 50));
       lblMM.setPreferredSize(new Dimension(60, 50));
       lblSS.setPreferredSize(new Dimension(60, 50));

       // create a function action listener to upadate time
       Timer timer = new Timer(1000, new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent e) {
               // set time to Jlabels
               // create calendar instance
               Calendar calendar = Calendar.getInstance();
               // set calendar hour to lblHH jlabel
               lblHH.setText(String.valueOf(calendar.get(Calendar.HOUR)));
               // set calendar minute to lblMM jlabel
               lblMM.setText(String.valueOf(calendar.get(Calendar.MINUTE)));
               // set calendar second to lblSS jlabel
               lblSS.setText(String.valueOf(calendar.get(Calendar.SECOND)));
               // check AM or PM
               if (calendar.get(Calendar.AM_PM) == Calendar.AM)
                   lblAmPm.setText("AM");
               else
                   lblAmPm.setText("PM");

           }
       });
       // start timer
       timer.start();

       // add jlabels to panel
       panel.add(lblHH);
       panel.add(lblMM);
       panel.add(lblSS);

       // add panel and ampm label to fr
       fr.add(panel);
       fr.add(lblAmPm);

       // set title and size of fr
       fr.setTitle("Digital Clock");
       fr.setSize(275, 175);
       fr.show();

   }

}