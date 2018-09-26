package h11.Assignments;

import java.applet.Applet;
import java.awt.*;

public class CircelX100Plus extends Applet {

    public void init() {
        setSize(1000,1000);
    }

    public void paint(Graphics g) {
        int x = 5, y = 5;
        int counter;

        for (counter = 0; counter < 200; counter++) {
            x += 10;
            y += 10;
            g.drawOval(10,10, x, y);
        }
    }
}
