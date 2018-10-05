package h12;

import java.awt.*;
import java.applet.*;

public class H12_4 extends Applet {
    double[] salary = { 100.0, 200.0, 500.0, 400.0, 300.0 };
    double maximum;

    public void init() {
        maximum = salary[0];
        for (int counter = 0; counter < salary.length; counter ++) {
            if(salary[counter] > maximum) {
                maximum = salary[counter];
            }
        }
    }

    public void paint(Graphics g)  {
        g.drawString("the maximum is: " + maximum, 50, 20);
    }
}