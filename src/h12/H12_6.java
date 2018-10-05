package h12;

import java.awt.*;
import java.applet.*;
import java.util.*;

public class H12_6 extends Applet {
    String[] names = { "Valerie", "Jeroen", "Sander", "Frank"};

    public void init() {
        Arrays.sort(names);
    }

    public void paint(Graphics g) {
        for (int counter = 0; counter < names.length; counter ++) {
            g.drawString("" + names[counter], 50, 20 * counter + 20);
        }
    }
}