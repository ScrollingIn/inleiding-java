package h04;

import java.awt. *;
import java.applet. *;

public class Oval extends java.applet.Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.red);
        g.drawOval(25, 25, 350, 350);
        g.fillOval(25, 25, 350, 350);
    }
}