package h12.Assignments;

import java.applet.Applet;
import java.awt. *;

public class AH12_2 extends Applet {
    Button[] button;

    public void init() {
        button = new Button[25];
        for (int counter = 0; counter < button.length; counter ++) {
            button[counter] = new Button();
            add(button[counter]);
        }
    }

    public void paint(Graphics g){
        for (int counter = 0; counter < button.length; counter ++) {
        }
    }
}
