package h04.Assignments;

import java.awt.*;

public class DiceFour extends java.applet.Applet {

    public void init(){
    }

    public void paint(Graphics g){
        g.setColor(Color.black);
        g.drawRoundRect(20,20,50,50,15,15);

        g.fillRoundRect(25,25,12,12,12,12);
        g.fillRoundRect(25,53,12,12,12,12);
        g.fillRoundRect(53,25,12,12,12,12);
        g.fillRoundRect(53,53,12,12,12,12);
    }
}
