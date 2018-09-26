package h11.Assignments;

import java.applet.Applet;
import java.awt.*;

public class CirclesX5 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int x = 100, y = 100, x2 = 5, y2 = 5;
        int counter;

        for (counter = 0; counter < 5; counter++) {
            x -= 5;
            y -= 5;
            x2 += 10;
            y2 += 10;
            g.drawOval(x, y, x2, y2);
        }
    }
}
