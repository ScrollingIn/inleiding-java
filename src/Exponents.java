import com.sun.applet2.preloader.event.ApplicationExitEvent;

import java.applet.Applet;
import java.awt.*;
import java.awt.event. *;

public class Exponents extends Applet {
    int input;
    int counter;
    String s;
    TextField textfield;

    public void init() {
        textfield = new TextField("", 3);
        textfield.addActionListener(new TextfieldListener());
        input = 2;
        add(textfield);
    }

    public void paint(Graphics g) {
        int y = 20;

        for (counter = input; counter < 10000001; counter*= input) {
            y += 20;
            g.drawString("" + counter,20,y);
        }
    }
    class TextfieldListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = textfield.getText();
            input = Integer.parseInt(s);
            repaint();
        }
    }
}
