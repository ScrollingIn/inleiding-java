package h11.Assignments;

import java.applet.Applet;
import java.awt.*;

public class DoYouLikeChess extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawRect(20,20,160,160);
        int x = 0;
        int y = 0;
        int column;

        for (column = 0; column < 8; column++){
            g.setColor(Color.black);
            x += 20;
            y += 20;
            g.fillRect(x,y,20,20);
        }

        y = 0;
        x = 40;
        for (column = 0; column < 6; column++){
            g.setColor(Color.black);
            x += 20;
            y += 20;
            g.fillRect(x,y,20,20);
        }

        y = 0;
        x = 80;
        for (column = 0; column < 4; column++){
            g.setColor(Color.black);
            x += 20;
            y += 20;
            g.fillRect(x,y,20,20);
        }

        y = 0;
        x = 120;
        for (column = 0; column < 2; column++){
            g.setColor(Color.black);
            x += 20;
            y += 20;
            g.fillRect(x,y,20,20);
        }

        y = 40;
        x = 0;
        for (column = 0; column < 6; column++){
            g.setColor(Color.black);
            x += 20;
            y += 20;
            g.fillRect(x,y,20,20);
        }

        y = 80;
        x = 0;
        for (column = 0; column < 4; column++){
            g.setColor(Color.black);
            x += 20;
            y += 20;
            g.fillRect(x,y,20,20);
        }

        y = 120;
        x = 0;
        for (column = 0; column < 2; column++){
            g.setColor(Color.black);
            x += 20;
            y += 20;
            g.fillRect(x,y,20,20);
        }
    }
}
