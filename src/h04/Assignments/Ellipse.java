package h04.Assignments;

import java.awt. *;
import java.applet. *;

public class Ellipse extends java.applet.Applet{

    public void init(){
    }

    public void paint(Graphics g){
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawArc(20,20,150,100,0,360);
        g.fillArc(20,20,150,100,0,360);
    }
}
