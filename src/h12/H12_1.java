package h12;

import java.awt.*;
import java.applet.*;

public class H12_1 extends Applet {
    double salary[];

    public void init() {
        salary = new double [5];

        for (int counter = 0; counter  < salary.length; counter  ++) {
            salary[counter ] = 100 * counter + 100;
        }
    }

    public void paint(Graphics g) {
        for (int counter  = 0; counter  < salary.length; counter  ++) {
            g.drawString("" + salary[counter ], 50, 20 * counter  + 20);
        }
    }
}
