package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Decisions5 extends Applet {
    TextField textfield;
    Label label;
    String s, text;
    int day;

    public void init() {
        textfield = new TextField("", 20);
        label = new Label("Type in the day number");
        textfield.addActionListener(new TextfieldListener());

        text = "";
        add(textfield);
        add(label);

    }

    public void paint(Graphics g) {
        g.drawString(text, 50, 60);
    }

    class TextfieldListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            s = textfield.getText();
            day = Integer.parseInt( s );
            switch(day) {
                case 1:
                    text = "Sunday";
                    break;
                case 2:
                    text = "Monday";
                    break;
                case 3:
                    text = "Tuesday";
                    break;
                case 4:
                    text = "Wednesday";
                    break;
                case 5:
                    text = "Thursday";
                    break;
                case 6:
                    text = "Friday";
                    break;
                case 7:
                    text = "Saturday";
                    break;
                default:
                    text = "You entered the wrong number, try again.";
                    break;
            }
            repaint();
        }
    }
}
