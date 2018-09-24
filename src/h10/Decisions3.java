package h10;

import java.applet.Applet;
import java.awt.*;

public class Decisions3 extends Applet {

    public void init(){
        setBackground(Color.pink);
    }

    public void paint(Graphics g) {
        g.drawString("" + 6 + " is bigger than "+ 5 + " and smaller than " +
                8  + ": " +(6 > 5 && 6 < 8), 50, 60 );
        g.drawString("" + 6 + " is bigger than "+ 5 + " and bigger than" +
                8 + ": " + (6 > 5 && 6 > 8), 50, 80 );
        g.drawString("" + 6 + " is smaller than "+ 5 + " and bigger than" +
                8 + ": " + (6 <  5 && 6 > 8), 50, 100 );
        g.drawString("" + 6 + " is smaller than "+ 5 + " and smaller than " +
                8 + ": " + (6 < 5 && 6 < 8), 50, 120 );
        g.drawString("" + 6 + " is bigger than " + 5 + ": " +
                (!(6 > 5)), 50, 140 );
        g.drawString("" + 6 + " is smaller than " + 5 + ": " +
                (! (6 < 5)), 50, 160 );
    }
}
