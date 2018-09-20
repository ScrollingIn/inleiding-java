package h08.Assignments;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SchoolGenderButtons extends Applet {
    Button button1, button2, button3, button4;
    Label label1, label2;
    int totalCounter, counter1, counter2, counter3, counter4;

    public void init() {
        totalCounter = 0;
        counter1 = 0;
        counter2 = 0;
        counter3 = 0;
        counter4 = 0;

        setBackground(Color.pink);
        label1 = new Label("Entry School->");

        button1 = new Button("Men");
        Button1Listener bl1 = new Button1Listener();
        button1.addActionListener(bl1);

        button2 = new Button("Women");
        Button2Listener bl2 = new Button2Listener();
        button2.addActionListener(bl2);

        label2 = new Label("Students ->");

        button3 = new Button("Male");
        Button3Listener bl3 = new Button3Listener();
        button3.addActionListener(bl3);

        button4 = new Button("Female");
        Button4Listener bl4 = new Button4Listener();
        button4.addActionListener(bl4);

        add(label1);
        add(button1);
        add(button2);
        add(label2);
        add(button3);
        add(button4);
    }

    public void paint(Graphics g) {
      g.drawString("" + counter1,120,40);
      g.drawString("" + counter2,170,40);
      g.drawString("" + counter3,310,40);
      g.drawString("" + counter4,360,40);
      g.drawString("Total Visited " + totalCounter,210,60);
    }

    class Button1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            counter1 = counter1 + 1;
            totalCounter = totalCounter + 1;
            repaint();
        }
    }
    class Button2Listener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            counter2 = counter2 +1;
            totalCounter = totalCounter +1;
            repaint();
            }
    }
    class Button3Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        counter3 = counter3 + 1;
        totalCounter = totalCounter + 1;
        repaint();
        }
    }
    class Button4Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        counter4 = counter4 +1;
        totalCounter = totalCounter + 1;
        repaint();
        }
    }
}
