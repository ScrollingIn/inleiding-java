package h04.Assignments;

import java.awt.*;

public class TrafficLight extends java.applet.Applet {

    public void init(){
    }

    public void paint(Graphics g){
        g.setColor(Color.black);
        g.drawRoundRect(32,75,15,100,15,15);
        g.fillRoundRect(32,75,15,100,15,15);

        g.setColor(Color.black);
        g.drawRoundRect(20,20,40,80,40,40);
        g.fillRoundRect(20,20,40,80,40,40);

        g.setColor(Color.red);
        g.drawOval(32,30,15,15);
        g.fillOval(32,30,15,15);

        g.setColor(Color.orange);
        g.drawOval(32,50, 15,15);
        g.fillOval(32,50,15,15);

        g.setColor(Color.green);
        g.drawOval(32,70,15,15);
        g.fillOval(32,70,15,15);


    }
}
