package h11.Assignments;

import java.applet.Applet;
import java.awt. *;

public class TableOf3  extends Applet {
    public void init(){
    }

    public void paint(Graphics g) {
        int counter;
        int y = 0;

        for (counter = 3; counter < 31; counter+=3) {
            y += 20;
            g.drawString("" + counter,50,y);
        }
    }
}
