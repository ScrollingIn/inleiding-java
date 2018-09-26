package h11;

import java.awt.*;
import java.applet.*;

public class ForStatement extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int counter;
        int y = 0;

        for(counter = 0; counter < 10; counter++) {
            y += 20;
            g.drawLine(50 , y, 300, y );
            g.drawString("" + counter ,305, y );
        }
    }
}
