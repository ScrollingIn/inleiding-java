package h04;// Example 4.1
import java.awt. *;
import java.applet. *;

public class Drawing extends java.applet.Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawRect(20, 20, 100, 50);
        g.fillRect(20, 80, 100, 50);

    }
}