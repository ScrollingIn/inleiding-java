package h07;

import java.applet.Applet;
import java.awt.*;

public class Sizes extends Applet {

    public void init(){
        setSize(400,90);
    }
    public void paint(Graphics g){
        setBackground(Color.black);
        g.setColor(Color.red);
        g.drawString("Custom Size",30,40);
    }
}
