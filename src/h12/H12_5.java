package h12;

import java.awt.*;
import java.applet.*;

public class H12_5 extends Applet {
    boolean found;
    double[] salary = { 100.0, 200.0, 500.0, 400.0, 300.0 };
    double searching;

    public void init() {
        searching = 400;
        found = false;
        int counter = 0;
        while(counter < salary.length) {
            if(salary[counter] == searching) {
                found = true;
            }
            counter ++;
        }
    }

    public void paint(Graphics g) {
        if(found == true) {
            g.drawString("The value is found.", 20, 50);
        }
        else {
            g.drawString("The value isn't found.", 20, 50);
        }
    }
}