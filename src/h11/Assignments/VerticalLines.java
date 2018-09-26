package h11.Assignments;

import java.applet.Applet;
import java.awt.*;

public class VerticalLines extends Applet {

    public void init(){
    }

    public void paint(Graphics g){
        int counter;
        int x = 10;

        for (counter = 0; counter < 10; counter++){
            x += 20;
            g.drawLine(x,20,x,200);
            g.drawString("" + counter,x,10);
        }
    }
}
