package h11;

import java.awt. *;
import java.applet.Applet;

public class WhileStatement extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int counter = 0;
        int y = 0;

        while(counter < 10) {
            y += 20;
            g.drawLine(50 , y, 300, y );
            g.drawString("" + counter, 305, y );
            counter++;
        }
    }
}
