package LayoutManagers;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class TestProgress {

   public static void main(String[] args) {
        // create jframe
        JFrame frame = new JFrame();
        // set grid layout with 11 rows and 1 column
        frame.setLayout(new GridLayout(11, 1));

        // create 11 jlbls
        JLabel[] lblArray = new JLabel[10];
        for(int i = 0; i < lblArray.length; i++)
        {
            lblArray[i] = new JLabel();

            // set initial background color of 11 jlbls to red
            lblArray[i].setBackground(Color.RED);

            // set opaque true to set background color
            lblArray[i].setOpaque(true);       

            // add all lbls to frame
            frame.add(lblArray[i]);
        }

       JLabel lblPercent = new JLabel("0%", SwingConstants.CENTER);
       frame.add(lblPercent);

       // create a scanner object
       Scanner scanner = new Scanner(System.in);
       // set count to zero
       int count = 0;
       // loop for 10 times
       while (count <= 9) {
           // set title of frame
           frame.setTitle("Progress Meter");
           // set size of frame
           frame.setSize(50, 550);
           // show frame
           frame.show();
           // increment count by 1
           count++;

           // get enter from console
           scanner.nextLine();

           // choose lbl and change color by count
           lblArray[count - 1].setBackground(Color.green);
           lblPercent.setText((count * 10) + "%");
       }
   }

}