package h04.Assignments;

import java.awt. *;
import java.applet. *;

public class House extends java.applet.Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.cyan);
        // grass
        g.setColor(Color.green);
        g.drawRect(0,250,5000,1000);
        g.fillRect(0,250,5000,1000);
        // sun
        g.setColor(Color.yellow);
        g.drawArc(275,0,125,125,0,360);
        g.fillArc(275,0,125,125,0,360);
        // roof
        g.setColor(Color.red);
        g.drawArc(50,20,200,200,240,60);
        g.fillArc(50,20,200,200,240,60);
        // house
        g.setColor(Color.orange);
        g.drawRect(100,205,100,75);
        g.fillRect(100,205,100,75);
        // door
        g.setColor(Color.pink);
        g.drawRect(105,250,20,30);
        g.fillRect(105,250,20,30);
        // window
        g.setColor(Color.lightGray);
        g.drawRect(135,255,55,15);
        g.fillRect(135,255,55,15);
        // path
        g.setColor(Color.darkGray);
        g.drawRect(105,280,20,50);
        g.fillRect(105,280,20,50);
    }
}
