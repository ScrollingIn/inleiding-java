import java.awt. *;
import java.applet. *;

// a class named Show of type Applet
public class Finished extends java.applet.Applet {

    public void init() {
        setBackground(Color.black);
    }

    public void paint(Graphics g) {
        g.setFont(g.getFont().deriveFont(Font.ITALIC));
        g.setColor(Color.green);
        g.drawString("Finished", 70, 75);
    }
}

