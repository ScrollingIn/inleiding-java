package h10;

import java.applet.Applet;
import java.awt.*;

public class Decisions extends Applet {

    public void init(){ setBackground(Color.pink);}

    public void paint(Graphics g){
        g.drawString("" + 8 + " is bigger than " + 5 + " : " + (8 > 5),50,60);
        g.drawString("" + 8 + " is less than " + 5 + " : " + (8 < 5),50,80);
    }
}
