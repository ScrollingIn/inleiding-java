package h11.Assignments;

import java.applet.Applet;
import java.awt.*;

public class Numbers10To20 extends Applet {

    public void init(){
    }

    public void  paint(Graphics g){
        int counter;
        int y = 250;

        for (counter = 10; counter < 21; counter++){
            y -= 20;
            g.drawString("" + counter,50,y);
        }

    }

}
