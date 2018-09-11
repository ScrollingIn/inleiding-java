package h04;

import java.awt. *;
import java.applet. *;

public class RoundRect extends java.applet.Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.magenta);
        g.drawRoundRect (20,20,100,100,50,50);
        g.fillRoundRect(20,20,100,100,50,50);
        g.setColor(Color.pink);
        g.drawRoundRect (30,30,80,80,50,50);
        g.fillRoundRect(30,30,80,80,50,50);
    }
}