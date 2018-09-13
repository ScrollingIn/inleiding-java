package h06;

import java.applet.Applet;
import java.awt.*;

public class DontBeNegative extends Applet {
    int a;
    int outcome;

    public void init(){
        a = 2147483647;
        outcome = a + a;

    }

    public void paint(Graphics g){
        g.drawString("outcome is "+ outcome,10,10);
    }
}
