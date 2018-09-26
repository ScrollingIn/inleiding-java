package h11.Assignments;

import java.applet.Applet;
import java.awt.*;

public class DiagonalSquares extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int x = 10, y = 10;
        int counter;

        for (counter = 0; counter < 5; counter++) {
            x += 20;
            y += 20;

            g.drawRect(x,y,20,20);
        }
    }
}
