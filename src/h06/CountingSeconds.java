package h06;

import java.applet.Applet;
import java.awt.*;

public class CountingSeconds extends Applet {
    int a;
    int b;
    int c;
    int outcome1;
    int outcome2;
    int outcome3;

    public void init(){
        a = 60;
        b = 24;
        c = 365;
        outcome1 = a * a;
        outcome2 = a * a * b;
        outcome3 = a * a * b * c;
    }

    public void paint(Graphics g){
        g.drawString("A minute contains " + a + " seconds",0,10);
        g.drawString("An hour contains " + outcome1 + " seconds",0,20);
        g.drawString("A day contains " + outcome2 + " seconds",0,30);
        //A year here is calculated as in 365 days, not as 365.25 days.
        g.drawString("A year contains " + outcome3 + " seconds",0,40);
    }
}
