package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class H12_6 extends Applet {
    int[] numbers = { 1,6,4,3,3,9,7,3,4,4,7,3,2,5,6,7,8,5,4,4,3 };
    TextField textfield;
    int output,totalfound;
    boolean found;

    public void init() {
        Arrays.sort(numbers);
        textfield = new TextField("",2);
        textfield.addActionListener(new TextFieldListener());
        found = false;
        add (textfield);
    }

    public void paint(Graphics g) {
        if (found == true) {
            g.drawString("is found " + totalfound + " times",230,20);
        }
        else {
            g.drawString("yermom",230,20);
        }
    }
    class TextFieldListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            totalfound = 0;
            found = false;

            output = Integer.parseInt(textfield.getText());
            int counter = 0;
            while (counter < numbers.length) {
                if (numbers[counter] == output) {
                    found = true;
                    totalfound ++;
                }
                counter ++;
            }
            repaint();
        }
    }
}