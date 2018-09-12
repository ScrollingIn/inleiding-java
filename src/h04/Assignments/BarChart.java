package h04.Assignments;

import java.awt.*;
import java.applet. *;

public class BarChart extends java.applet.Applet{

    public void init(){
    }

    public void paint(Graphics g){
        setBackground(Color.white);
        // chart
        g.setColor(Color.black);
        g.drawString("Gewicht in KG",50,78);
        g.drawRect(40,80,240,140);
        g.drawString("0",35,230);
        g.drawString("100",18,122);
        g.drawLine(40,120,45,120);
        g.drawString("80",18,142);
        g.drawLine(40,140,45,140);
        g.drawString("60",18,162);
        g.drawLine(40,160,45,160);
        g.drawString("40",18,182);
        g.drawLine(40,180,45,180);
        g.drawString("20",18,202);
        g.drawLine(40,200,45,200);
        g.drawString("120",18,102);
        g.drawLine(40,100,45,100);
        g.drawString("140",18,82);
        g.drawLine(40,80,45,80);
        // bars
        g.setColor(Color.red);
        g.drawString("Valerie",35,240);
        g.drawRect(50,180,20,40);
        g.fillRect(50,180,20,40);

        g.setColor(Color.blue);
        g.drawString("Jeroen",80,240);
        g.drawRect(90,120,20,100);
        g.fillRect(90,120,20,100);

        g.setColor(Color.green);
        g.drawString("Hans",125,240);
        g.drawRect(130,140,20,80);
        g.fillRect(130,140,20,80);

        g.setColor(Color.magenta);
        g.drawString("マリナ直美製",10,10);
    }
}
