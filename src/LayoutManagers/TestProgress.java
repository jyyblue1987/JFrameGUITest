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

       // create 11 jlabels
       JLabel label1 = new JLabel();
       JLabel label2 = new JLabel();
       JLabel label3 = new JLabel();
       JLabel label4 = new JLabel();
       JLabel label5 = new JLabel();
       JLabel label6 = new JLabel();
       JLabel label7 = new JLabel();
       JLabel label8 = new JLabel();
       JLabel label9 = new JLabel();
       JLabel label10 = new JLabel();
       JLabel label11 = new JLabel("0%", SwingConstants.CENTER);

       // set initial background color of 11 jlabels to red
       label1.setBackground(Color.RED);
       label2.setBackground(Color.red);
       label3.setBackground(Color.red);
       label4.setBackground(Color.red);
       label5.setBackground(Color.red);
       label6.setBackground(Color.red);
       label7.setBackground(Color.red);
       label8.setBackground(Color.red);
       label9.setBackground(Color.red);
       label10.setBackground(Color.red);

       // set opaque true to set background color
       label1.setOpaque(true);
       label2.setOpaque(true);
       label3.setOpaque(true);
       label4.setOpaque(true);
       label5.setOpaque(true);
       label6.setOpaque(true);
       label7.setOpaque(true);
       label8.setOpaque(true);
       label9.setOpaque(true);
       label10.setOpaque(true);

       // add all labels to frame
       frame.add(label1);
       frame.add(label2);
       frame.add(label3);
       frame.add(label4);
       frame.add(label5);
       frame.add(label6);
       frame.add(label7);
       frame.add(label8);
       frame.add(label9);
       frame.add(label10);
       frame.add(label11);

       // create a scanner object
       Scanner scanner = new Scanner(System.in);
       // set count to zero
       int count = 0;
       // loop for 10 times
       while (count <= 10) {
           // set title of frame
           frame.setTitle("Progress Meter");
           // set size of frame
           frame.setSize(50, 550);
           // show frame
           frame.show();
           // increment count by 1
           count++;
           // get enter from console
           String string = scanner.nextLine();
           // choose label and change color by count
           switch (count) {
           case 1:
               label1.setBackground(Color.green);
               label11.setText("10%");
               label1.setOpaque(true);

               break;
           case 2:
               label2.setBackground(Color.green);
               label11.setText("20%");
               label2.setOpaque(true);
               break;
           case 3:
               label3.setBackground(Color.green);
               label11.setText("30%");
               label3.setOpaque(true);
               break;
           case 4:
               label4.setBackground(Color.green);
               label11.setText("40%");
               label4.setOpaque(true);
               break;
           case 5:
               label5.setBackground(Color.green);
               label11.setText("50%");
               label5.setOpaque(true);
               break;
           case 6:
               label6.setBackground(Color.green);
               label11.setText("60%");
               label6.setOpaque(true);
               break;
           case 7:
               label7.setBackground(Color.green);
               label11.setText("70%");
               label7.setOpaque(true);
               break;
           case 8:
               label8.setBackground(Color.green);
               label11.setText("80%");
               label8.setOpaque(true);
               break;
           case 9:
               label9.setBackground(Color.green);
               label11.setText("90%");
               label9.setOpaque(true);
               break;
           case 10:
               label10.setBackground(Color.green);
               label11.setText("100%");
               label10.setOpaque(true);
               break;

           }

       }

   }

}