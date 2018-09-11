package h04;

import java.awt. *;
import java.applet. *;

public class LastOne extends java.applet.Applet{

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.cyan);
        g.setColor(Color.white);
        g.drawArc(20,20,100,50,90,45);
        g.fillArc(20,20,100,50,90,45);
    }
}
