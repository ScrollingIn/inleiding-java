package h10;

import java.awt. *;
import java.applet.Applet;
import java.awt.event. *;

public class Decisions4 extends Applet {
    TextField textfield;
    Label label;
    String s, text;
    int yearNumber;

    public void init() {
        setBackground(Color.pink);
        textfield = new TextField("", 20);
        label = new Label("Type a year number");
        textfield.addActionListener(new TextfieldListener());
        text = "";

        add(label);
        add(textfield);
    }

    public void paint(Graphics g) {
        g.drawString(text, 50, 60);
    }

    class TextfieldListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = textfield.getText();
            yearNumber = Integer.parseInt(s);
            if ((yearNumber % 4 == 0 && !(yearNumber % 100 == 0)) ||
                    yearNumber % 400 == 0) {
                text = "" + yearNumber + " is a leap year";
            }
            else {
                text = "" + yearNumber + " is not a leap year";
            }
            repaint();
        }
    }
}