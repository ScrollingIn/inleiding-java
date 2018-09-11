package h04;

import java.awt. *;
import java.applet. *;

public class Square extends java.applet.Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawRect(20, 20, 150, 150);
        g.fillRect(20, 20, 150, 150);

    }
}