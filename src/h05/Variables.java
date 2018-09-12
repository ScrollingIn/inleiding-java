package h05;

import java.applet.Applet;
import java.awt.*;

public class Variables extends Applet {
    //Names
    Color Valerie;
    Color Jeroen;
    Color Hans;
    //Position in Applet Viewer
    int yV;
    int yJ;
    int yH;
    //Weight
    int WeightV;
    int WeightJ;
    int WeightH;

    public void init(){
        Valerie = Color.red;
        Jeroen = Color.blue;
        Hans = Color.green;
        //where Height increases the y decreases and vise versa.
        yV = 180;
        yJ = 130;
        yH = 145;
        WeightV = 40;
        WeightJ = 90;
        WeightH = 75;
    }
    public void paint(Graphics g) {
        setBackground(Color.white);
        // chart
        g.setColor(Color.black);
        g.drawString("Weight in KG", 50, 78);
        g.drawRect(40, 80, 240, 140);
        g.drawString("0", 35, 230);
        g.drawString("100", 18, 122);
        g.drawLine(40, 120, 45, 120);
        g.drawString("80", 18, 142);
        g.drawLine(40, 140, 45, 140);
        g.drawString("60", 18, 162);
        g.drawLine(40, 160, 45, 160);
        g.drawString("40", 18, 182);
        g.drawLine(40, 180, 45, 180);
        g.drawString("20", 18, 202);
        g.drawLine(40, 200, 45, 200);
        g.drawString("120", 18, 102);
        g.drawLine(40, 100, 45, 100);
        g.drawString("140", 18, 82);
        g.drawLine(40, 80, 45, 80);
        // bars
        g.setColor(Valerie);
        g.drawString("Valerie",35,240);
        g.drawRect(50,yV,20,WeightV);
        g.fillRect(50,yV,20,WeightV);

        g.setColor(Jeroen);
        g.drawString("Jeroen",80,240);
        g.drawRect(90,yJ,20,WeightJ);
        g.fillRect(90,yJ,20,WeightJ);

        g.setColor(Hans);
        g.drawString("Hans",125,240);
        g.drawRect(130,yH,20,WeightH);
        g.fillRect(130,yH,20,WeightH);
    }
}
