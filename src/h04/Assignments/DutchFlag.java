package h04.Assignments;

import java.awt. *;
import java.applet. *;

public class DutchFlag extends java.applet.Applet{

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.DARK_GRAY);
        // flagpole
        g.setColor(Color.black);
        g.drawRoundRect(15,10,15,250,50,50);
        g.fillRoundRect(15,10,15,250,50,50);
        g.setColor(Color.orange);
        g.drawArc(12,0,20,20,0,360);
        g.fillArc(12,0,20,20,0,360);
        // red part of flag
        g.setColor(Color.red);
        g.drawRect(30,20,125,25);
        g.fillRect(30,20,125,25);
        // white part of flag
        g.setColor(Color.white);
        g.drawRect(30,45,125,25);
        g.fillRect(30,45,125,25);
        // blue part of flag
        g.setColor(Color.blue);
        g.drawRect(30,70,125,25);
        g.fillRect(30,70,125,25);
    }
}
