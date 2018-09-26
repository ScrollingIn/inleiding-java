package h11.Assignments;

import java.applet.Applet;
import java.awt.*;

public class CircelX50 extends Applet {

    public void init() {
        setSize(750,750);
    }

    public void paint(Graphics g) {
        int x = 375, y = 375, x2 = 5, y2 = 5;
        int counter;

        for (counter = 0; counter < 50; counter++) {
            x -= 5;
            y -= 5;
            x2 += 10;
            y2 += 10;
            g.drawOval(x,y,x2,y2);
        }
    }
}
