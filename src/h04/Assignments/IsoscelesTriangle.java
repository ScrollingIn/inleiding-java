package h04.Assignments;

import java.awt. *;
import java.applet. *;

public class IsoscelesTriangle extends java.applet.Applet{
    public void init() {
    }

    public void paint(Graphics g){
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawArc(20,20,200,200,180,90);
        g.fillArc(20,20,200,200,180,90);
    }
}
