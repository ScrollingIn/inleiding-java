package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Decisions2 extends Applet {
    int age;
    TextField textfield;
    Label label;
    String text;

    public void init() {
        setBackground(Color.pink);
        textfield = new TextField("", 5);
        textfield.addActionListener(new FieldListener());
        text = "";
        label = new Label("Enter your age");

        add(label);
        add(textfield);
    }

    public void paint(Graphics g) {
        g.drawString(text, 20, 60);
    }

    class FieldListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;

            s = textfield.getText();
            age = Integer.parseInt(s);
            if (age > 20) {
                text = "you are 20 or above.";
            } else {
                text = "you are 19 or below.";
            }
            repaint();
        }
    }
}
