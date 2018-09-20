package h06;

import java.applet.Applet;
import java.awt.*;

public class EurosToDevide extends Applet {

    double a, b, outcome;

    public void init() {
        a = 113;
        b = 4;
        outcome = a / b;
    }
    public void paint(Graphics g){
        g.drawString("Jan", 0, 20);
        g.drawString("Ali", 0,30);
        g.drawString("Jeannette", 0,40);
        g.drawString("Malina", 0,50);

        g.setColor(Color.green);
        g.drawString("€" + outcome,100,20);
        g.drawString("€" + outcome,100,30);
        g.drawString("€" + outcome,100,40);
        g.drawString("€" + outcome,100,50);
    }
}
