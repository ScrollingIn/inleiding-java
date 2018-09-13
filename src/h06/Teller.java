import java.awt.*;
import java.applet.*;


public class Teller extends Applet {
    int teller;

    public void init() {
        teller = 2;
    }

    public void paint(Graphics g) {
        teller++;
        g.drawString("Scherm is " + teller +
                " keer ververst.", 50, 60 );
    }
}